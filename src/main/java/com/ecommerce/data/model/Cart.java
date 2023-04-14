package com.ecommerce.data.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade= CascadeType.ALL)
    private Set<Product> productList;
    @OneToOne(cascade = CascadeType.ALL)
    private Customer customer;
}
