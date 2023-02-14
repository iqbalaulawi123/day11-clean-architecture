package com.example.day11cleanarchitecture.service;

import com.example.day11cleanarchitecture.entity.UserEntity;
import com.example.day11cleanarchitecture.service.in.GetAllUserUseCase;
import com.example.day11cleanarchitecture.service.out.GetAllUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllUserService implements GetAllUserUseCase {
    private final GetAllUserPort getAllUserPort;

    @Override
    public List<UserEntity> getAllUser(){
        return getAllUserPort.getAllUser();
    }
}
