package com.project.msa_clients.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "T_CLIENTS")
public class Client  extends  Person{

    private String phone;

    private String email;

    private String address;

    private String status;



}
