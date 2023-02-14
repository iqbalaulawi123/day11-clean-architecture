package com.example.day11cleanarchitecture.service.in;

import com.example.day11cleanarchitecture.entity.UserEntity;

public interface UpdateUserUseCase {
    UserEntity updateUser(Long id, UserEntity userEntity);
}
