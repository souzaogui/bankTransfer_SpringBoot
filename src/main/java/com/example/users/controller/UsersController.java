package com.example.users.controller;

import com.example.users.usecase.RegisterUsersUseCase;
import com.example.users.usecase.RegisterUsersUseCase.RegisterUsers;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor

@RestController
@RequestMapping(path = "/api/users")
public class UsersController {

    private final RegisterUsersUseCase registerUsersUseCase;

    @PostMapping(path = "/register")
    public void registerUser(@RequestBody RegisterUsers user) {
        registerUsersUseCase.handle(user);
    }

//    @DeleteMapping(path = "/delete/{id}")
//    public void deleteUser(@PathVariable Integer id) {
//        userRepository.deleteById(id);
//    }
}
