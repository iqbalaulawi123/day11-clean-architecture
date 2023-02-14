package com.example.day11cleanarchitecture.service;

import com.example.day11cleanarchitecture.entity.UserEntity;
import com.example.day11cleanarchitecture.service.in.DeleteUserUseCase;
import com.example.day11cleanarchitecture.service.out.DeleteUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteUserService implements DeleteUserUseCase {

    //todo 3
    private DeleteUserPort deleteUserPort;

    @Override
    public void deleteUser(Long id){
        deleteUserPort.deleteUser(id);
    }
}
