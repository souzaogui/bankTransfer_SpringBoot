package com.example.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.users.model.User;
import com.example.users.repository.UserRepository;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    // TODO: Get

    @GetMapping(path = "/")
    public String validate() {
        return "Usuários Online";
    }

    @GetMapping(path = "/list-all")
    public List<User> getListUsers() {
        return (List<User>) userRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public User getUser(@PathVariable Integer id) {
        return userRepository.findById(id).get();
    }

    // TODO: Post

    @PostMapping(path = "/save")
    public String registerUser(@RequestBody User user) {
        userRepository.save(user);
        return "Usuário cadastrado com sucesso";
    }

    // TODO: Delete

    @DeleteMapping(path = "/delete/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userRepository.deleteById(id);
    }
}
