package com.example.day11cleanarchitecture.adapter.controller;

import com.example.day11cleanarchitecture.entity.UserEntity;
import com.example.day11cleanarchitecture.service.in.GetAllUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class GetAllUserController {
    private final GetAllUserUseCase getAllUserUseCase;

    @GetMapping
    public List<UserEntity> getAllUser(){
        return getAllUserUseCase.getAllUser();
    }

}
