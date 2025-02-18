package com.example.UserAddress.controller;

import com.example.UserAddress.dto.UserAddressDTO;
import com.example.UserAddress.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserAddressController {

    private  final UserService userService;

    public UserAddressController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users_address")
    public List<UserAddressDTO> getAllUsersWithAddresses(){
        return userService.getAllUsersWithAddresses();
    }
}
