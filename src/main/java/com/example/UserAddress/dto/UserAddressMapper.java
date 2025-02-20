package com.example.UserAddress.dto;

import com.example.UserAddress.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserAddressMapper {
    UserAddressMapper INSTANCE = Mappers.getMapper(UserAddressMapper.class);

    @Mapping(source = "id", target = "userId")
    @Mapping(source = "name", target = "userName")
    @Mapping(source = "email", target = "userEmail")
    @Mapping(source = "address.street", target = "street")
    @Mapping(source = "address.city", target = "city")
    UserAddressDTO userToUserAddressDTO(User user);
    User userAddressDTOToUser(UserAddressDTO userAddressDTO);
}