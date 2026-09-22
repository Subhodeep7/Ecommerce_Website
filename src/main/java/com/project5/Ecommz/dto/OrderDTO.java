package com.project5.Ecommz.dto;

import java.util.Date;
import java.util.List;

public class OrderDTO {
    private Long id;

    private double totalAmount;

    private String status;

    protected Date orderDate;

    private String userName;

    private String email;

    protected List<OrderItemDTO> orderItemDTOList;

    public OrderDTO(Long id, double totalAmount, Date orderDate, String status, String userName, String email, List<OrderItemDTO> orderItemDTOList) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.status = status;
        this.userName = userName;
        this.email = email;
        this.orderItemDTOList = orderItemDTOList;
    }

    public OrderDTO(Long orderId, double totalAmount, String status, Date orderDate, List<OrderItemDTO> orderItemDTOList) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.status = status;
        this.orderItemDTOList = orderItemDTOList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<OrderItemDTO> getOrderItemDTOList() {
        return orderItemDTOList;
    }

    public void setOrderItemDTOList(List<OrderItemDTO> orderItemDTOList) {
        this.orderItemDTOList = orderItemDTOList;
    }
}
