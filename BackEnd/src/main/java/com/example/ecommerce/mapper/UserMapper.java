package com.example.ecommerce.mapper;

import com.example.ecommerce.dto.UserResponse;
import com.example.ecommerce.model.User;

public class UserMapper {

    public static UserResponse toResponse(User user) {

        return new UserResponse(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }
}