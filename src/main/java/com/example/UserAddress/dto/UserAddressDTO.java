package com.example.UserAddress.dto;


import com.example.UserAddress.model.User;

public class UserAddressDTO {
    private  Long userId;
    private  String userName;
    private  String userEmail;
    private  String street;
    private  String city;

    public UserAddressDTO(User user) {
        this.userId = user.getId();
        this.userName = user.getName();
        this.userEmail = user.getEmail();
        this.street = user.getAddress().getStreet();
        this.city = user.getAddress().getCity();
    }

    public UserAddressDTO() {}

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
}
