package com.example.day11cleanarchitecture.service;

import com.example.day11cleanarchitecture.entity.UserEntity;
import com.example.day11cleanarchitecture.service.in.CreateUserUseCase;
import com.example.day11cleanarchitecture.service.out.CreateUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserService implements CreateUserUseCase {

    private final CreateUserPort createUserPort;
    @Override
    public UserEntity createUser(UserEntity userEntity){
        return createUserPort.createUser(userEntity);
    }
}
