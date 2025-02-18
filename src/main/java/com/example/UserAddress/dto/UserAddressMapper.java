package com.example.UserAddress.dto;

import com.example.UserAddress.model.Address;
import com.example.UserAddress.model.User;

public class UserAddressMapper {


    public static UserAddressDTO toDTO(User user) {
        return new UserAddressDTO(user);
    }

    public static User toEntity(UserAddressDTO dto) {
        User user = new User();
        user.setName(dto.getUserName());
        user.setEmail(dto.getUserEmail());

        Address address = new Address(dto.getCity(), dto.getStreet(), user);
        user.setAddress(address);
        return user;
    }


}