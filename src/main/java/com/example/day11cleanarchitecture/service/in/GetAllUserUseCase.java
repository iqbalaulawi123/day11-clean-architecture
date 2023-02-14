package com.example.day11cleanarchitecture.service.in;

import com.example.day11cleanarchitecture.entity.UserEntity;

import java.util.List;

public interface GetAllUserUseCase {
    List<UserEntity> getAllUser();
}
