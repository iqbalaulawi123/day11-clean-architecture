package com.example.day11cleanarchitecture.adapter.persistence;

import com.example.day11cleanarchitecture.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
