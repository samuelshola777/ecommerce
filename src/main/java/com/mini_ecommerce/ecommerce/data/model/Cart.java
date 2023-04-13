package com.mini_ecommerce.ecommerce.data.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
    @OneToMany(cascade= CascadeType.ALL)
    private Set<Product> productList;
    private Customer customer;
}
