package com.example.UserAddress.service;
import com.example.UserAddress.dto.UserAddressDTO;
import com.example.UserAddress.dto.UserAddressMapper;
import com.example.UserAddress.dto.UserAddressMapperOld;
import com.example.UserAddress.model.User;
import com.example.UserAddress.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
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
            System.out.println(user.getName());
            UserAddressDTO userAddressDTO = UserAddressMapper.INSTANCE.userAddressDTO(user);
            userAddressDTOs.add(userAddressDTO);
        }
        return userAddressDTOs;
    }
}
