package com.mini_ecommerce.ecommerce.data.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    @NotEmpty
    @NotBlank
    private String firstName, lastName;
    @OneToOne(cascade= CascadeType.ALL)
    @NonNull
    @NotEmpty
    @NotBlank
    private Address customerAddress;
    @NonNull
    @NotEmpty
    @NotBlank
    private String emailAddress;
    @NonNull
    @NotEmpty
    @NotBlank
    private String phoneNumber;
    @NonNull
    @NotEmpty
    @NotBlank
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @NonNull
    @NotEmpty
    @NotBlank
    private String password;
    private BigDecimal walletBalance;
    private BigDecimal paymentBalance;
    @NonNull
    @NotEmpty
    @NotBlank
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToMany(cascade= CascadeType.ALL)
    private List<OrderZ> customerOrder;
    private boolean isLogin;
    private boolean isEnabled;
}