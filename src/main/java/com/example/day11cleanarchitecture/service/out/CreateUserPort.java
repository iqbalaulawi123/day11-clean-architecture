package com.example.day11cleanarchitecture.service.out;

import com.example.day11cleanarchitecture.entity.UserEntity;

import java.util.List;

public interface CreateUserPort {

    List<UserEntity> getAllUser();

    UserEntity createUser(UserEntity userEntity);
}
