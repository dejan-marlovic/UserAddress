package com.example.UserAddress.service;
import com.example.UserAddress.dto.UserAddressDTO;
import com.example.UserAddress.dto.UserAddressMapper;
import com.example.UserAddress.model.User;
import com.example.UserAddress.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<UserAddressDTO> getAllUsersWithAddresses() {
        List<User> users = userRepository.findAll();
        List <UserAddressDTO> userAddressDTOs = new ArrayList<>();

        for(User user : users){
            userAddressDTOs.add(UserAddressMapper.toDTO(user));
        }
        return userAddressDTOs;
    }
}
