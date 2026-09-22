package com.project5.Ecommz.service;

import com.project5.Ecommz.dto.OrderDTO;
import com.project5.Ecommz.dto.OrderItemDTO;
import com.project5.Ecommz.model.OrderItem;
import com.project5.Ecommz.model.Orders;
import com.project5.Ecommz.model.Product;
import com.project5.Ecommz.model.User;
import com.project5.Ecommz.repo.OrderRepository;
import com.project5.Ecommz.repo.ProductRepository;
import com.project5.Ecommz.repo.UserRepository;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class OrderService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderRepository orderRepository;


    public OrderDTO placeOrder(Long userId, Map<Long, Integer> productQuantities, double totalAmount) {
        User user = userRepository.findById(userId)
                .orElseThrow(()->new RuntimeException("User not found!"));

        Orders orders =new Orders();
        orders.setUser(user);
        orders.setOrderDate(new Date());
        orders.setStatus("Pending");
        orders.setTotalAmount(totalAmount);

        List<OrderItem> orderItemList = new ArrayList<>();
        List<OrderItemDTO> orderItemDTOList = new ArrayList<>();

        for(Map.Entry<Long,Integer> entry:productQuantities.entrySet()){
            Product product = productRepository.findById(entry.getKey())
                    .orElseThrow(()->new RuntimeException("Product not found!"));

            OrderItem orderItem = new OrderItem();
            orderItem.setOrder(orders);
            orderItem.setProduct(product);
            orderItem.setQuantity(entry.getValue());
            orderItemList.add(orderItem);
            orderItemDTOList.add(new OrderItemDTO(product.getName(),product.getPrice(),entry.getValue()));
        }

        orders.setOrderItems(orderItemList);

        Orders saveOrder = orderRepository.save(orders);



        return new OrderDTO(saveOrder.getOrderId(),saveOrder.getTotalAmount(),saveOrder.getStatus(),
                saveOrder.getOrderDate(),orderItemDTOList);
    }
}
