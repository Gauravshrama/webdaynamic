package com.example.webdaynamic.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    private String name;

    private String type;

    private String phonenumber;

    private String Email;

    private String Address;

    private String GSTnumber;

}
