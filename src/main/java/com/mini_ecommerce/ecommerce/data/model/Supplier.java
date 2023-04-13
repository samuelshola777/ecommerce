package com.mini_ecommerce.ecommerce.data.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@Entity
public class Supplier {
    @NonNull
    @NotEmpty
    @NotBlank
    private String supplierName;
    @NonNull
    @NotEmpty
    @NotBlank
    private Address supplierAddress;
    @NonNull
    @NotEmpty
    @NotBlank
    private String supplierEmailAddress;
    @NonNull
    @NotEmpty
    @NotBlank
    private String supplierPassword;
    @NonNull
    @NotEmpty
    @NotBlank
    private String supplierPhoneNumber;
    @OneToMany(cascade= CascadeType.ALL)
    private List<Product> productList;
    private boolean isLogin;
    private boolean isEnabled;
    private BigDecimal recievePaymentBalance;

}
