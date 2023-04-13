package com.mini_ecommerce.ecommerce.data.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    @NotEmpty
    @NotBlank
    private String productName;
    @NonNull
    @NotEmpty
    @NotBlank
    private Category category;
    @NonNull
    @NotEmpty
    @NotBlank
    private BigDecimal price;
    @NonNull
    @NotEmpty
    @NotBlank
    private long quantity;
    private  LocalDateTime supplyDate = LocalDateTime.now();
    @NonNull
    @NotEmpty
    @NotBlank
    @OneToMany(cascade=CascadeType.ALL)
    private Supplier productSupplier;
    @NonNull
    @NotEmpty
    @NotBlank
    private String skuNumber;


}
