package com.example.UserAddress.model;

import jakarta.persistence.*;

@Table(name = "addresses")
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String city;

    @OneToOne
    @JoinColumn(name= "user_id", unique = true, nullable = false)
    private User user;

    public Address(String street, String city, User user) {
        this.street = street;
        this.city = city;
        this.user = user;
    }

    public Address() {}

    public Long getId() {
        return id;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}