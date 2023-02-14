package com.example.day11cleanarchitecture.service;

import com.example.day11cleanarchitecture.entity.UserEntity;
import com.example.day11cleanarchitecture.service.in.UpdateUserUseCase;
import com.example.day11cleanarchitecture.service.out.UpdateUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateUserService implements UpdateUserUseCase {
    private final UpdateUserPort updateUserPort;

    @Override
    public UserEntity updateUser(Long id,UserEntity userEntity){
        return updateUserPort.updateUser(id, userEntity);
    }
}
