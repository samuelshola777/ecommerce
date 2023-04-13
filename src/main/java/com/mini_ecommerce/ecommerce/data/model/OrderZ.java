package com.mini_ecommerce.ecommerce.data.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;

import java.util.Set;

public class OrderZ {
    @OneToMany(cascade= CascadeType.ALL)
    private Set<Product> productList;
    @OneToMany(cascade= CascadeType.ALL)
    private Customer customer;
    @OneToMany(cascade= CascadeType.ALL)
    private Address deliveryAddress;
    private OrderStatus status;

}
