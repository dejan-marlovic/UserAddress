package com.example.UserAddress.dto;


public class UserAddressDTO {
    private Long userId;
    private String userName;
    private String userEmail;
    private String street;
    private String city;



    public UserAddressDTO() {}  // ✅ Keep only the no-arg constructor

    // Getters...

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }
}