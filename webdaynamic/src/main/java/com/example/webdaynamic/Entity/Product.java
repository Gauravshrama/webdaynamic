package com.example.webdaynamic.Entity;

import jakarta.persistence.*;

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double price;

    private String description ;

    @ManyToOne
    @JoinColumn(name = "party_id")
    private Party party;
}
