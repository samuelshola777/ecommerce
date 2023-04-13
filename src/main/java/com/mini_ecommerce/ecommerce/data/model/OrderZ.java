package com.mini_ecommerce.ecommerce.data.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Set;

public class OrderZ {
    @OneToMany(cascade= CascadeType.ALL)
    private Set<Product> productList;
    @OneToOne(cascade= CascadeType.ALL)
    private Customer customer;
    @OneToMany(cascade= CascadeType.ALL)
    private Address deliveryAddress;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

}
