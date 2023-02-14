package com.example.day11cleanarchitecture.service.out;

import com.example.day11cleanarchitecture.entity.UserEntity;

public interface UpdateUserPort {
    UserEntity updateUser(Long id, UserEntity userEntity);
}
