package com.example.day11cleanarchitecture.adapter.controller;

import com.example.day11cleanarchitecture.service.in.DeleteUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class DeleteUserController {
    private final DeleteUserUseCase deleteUserUseCase;
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id){
        //todo berhasil  1
        deleteUserUseCase.deleteUser(id);
        String message = "Berhasil Menghapus User";
        return ResponseEntity.ok().body(message);

    }
}
