package com.example.users.controller;

import com.example.users.model.User;
import com.example.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    // TODO: Get

    @GetMapping(path = "/")
    public String validate() {
        return "API Usuários Online";
    }

    @GetMapping(path = "/list-all")
    public List<User> getListAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public User getUser(@PathVariable Integer id) {
        return userRepository.findById(id).get();
    }

    // TODO: Post

    @PostMapping(path = "/register")
    public void registerUser(@RequestBody User user) {
        userRepository.save(user);
    }

    // TODO: Delete

    @DeleteMapping(path = "/delete/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userRepository.deleteById(id);
    }
}
