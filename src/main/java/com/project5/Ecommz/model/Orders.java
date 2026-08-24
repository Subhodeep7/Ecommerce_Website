package com.project5.Ecommz.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.Date;
@Entity
public class Orders {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;


    @ManyToOne
    @JsonManagedReference
    private User user;

    private String status;

    private double totalAmount;

    private Date orderDate;
}
