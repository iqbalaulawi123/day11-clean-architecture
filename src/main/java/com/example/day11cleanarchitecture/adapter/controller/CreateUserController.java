package com.example.day11cleanarchitecture.adapter.controller;

import com.example.day11cleanarchitecture.entity.UserEntity;
import com.example.day11cleanarchitecture.service.in.CreateUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class CreateUserController {
    private final CreateUserUseCase createUserUseCase;

    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity userEntity){
        return createUserUseCase.createUser(userEntity);
    }
}
