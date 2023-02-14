package com.example.day11cleanarchitecture.adapter.persistence;

import com.example.day11cleanarchitecture.entity.UserEntity;
import com.example.day11cleanarchitecture.service.out.CreateUserPort;
import com.example.day11cleanarchitecture.service.out.DeleteUserPort;
import com.example.day11cleanarchitecture.service.out.GetAllUserPort;
import com.example.day11cleanarchitecture.service.out.UpdateUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserPersistence implements GetAllUserPort,CreateUserPort, UpdateUserPort, DeleteUserPort {
    private final UserRepository userRepository;

    @Override
    public List<UserEntity> getAllUser(){
        return userRepository.findAll();
    }
    @Override
    public UserEntity createUser(UserEntity userEntity){
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity updateUser(Long id, UserEntity userEntity){
        userEntity.setId(id);
        return userRepository.save(userEntity);
    }

    @Override
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
