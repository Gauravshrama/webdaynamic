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

    @Override
    public String toString() {
        return "Party{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", Email='" + Email + '\'' +
                ", Address='" + Address + '\'' +
                ", GSTnumber='" + GSTnumber + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getGSTnumber() {
        return GSTnumber;
    }

    public void setGSTnumber(String GSTnumber) {
        this.GSTnumber = GSTnumber;
    }
}
