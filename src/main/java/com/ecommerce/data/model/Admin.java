package com.ecommerce.data.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String adminName;
    private String emailAddress;
    private String password;
    private String phoneNumber;
    @OneToOne(cascade = CascadeType.ALL)
    private AddressZ adminAddress;

}
