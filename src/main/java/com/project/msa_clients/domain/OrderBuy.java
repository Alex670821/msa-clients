package com.project.msa_clients.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "ORDERS")
public class OrderBuy {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String billNumber;

    private BigDecimal total;


    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;


}
