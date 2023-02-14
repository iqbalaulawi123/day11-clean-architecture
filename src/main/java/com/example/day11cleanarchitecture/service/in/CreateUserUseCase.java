package com.example.day11cleanarchitecture.service.in;

import com.example.day11cleanarchitecture.entity.UserEntity;

public interface CreateUserUseCase {
    UserEntity createUser(UserEntity userEntity);
}
