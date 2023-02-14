package com.example.day11cleanarchitecture.adapter.persistence;

import com.example.day11cleanarchitecture.entity.UserEntity;
import com.example.day11cleanarchitecture.service.out.CreateUserPort;
import com.example.day11cleanarchitecture.service.out.GetAllUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserPersistence implements GetAllUserPort,CreateUserPort {
    private final UserRepository userRepository;

    @Override
    public List<UserEntity> getAllUser(){
        return userRepository.findAll();
    }
    @Override
    public UserEntity createUser(UserEntity userEntity){
        return userRepository.save(userEntity);
    }
}
