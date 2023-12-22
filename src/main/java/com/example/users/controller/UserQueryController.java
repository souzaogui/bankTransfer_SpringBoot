package com.example.users.controller;

import com.example.users.app.UsersQueryAppService;
import com.example.users.model.UsersQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor

@RestController
@RequestMapping(path = "/query/api/users")
public class UserQueryController {

    private final UsersQueryAppService usersQueryAppService;

    @GetMapping(path = "/")
    public String validate() {
        return "API Usuários Online";
    }

    @GetMapping(path = "/list-all")
    public List<UsersQuery> getListAllUsers() {
        return usersQueryAppService.getAll();
    }

    @GetMapping(path = "/{id}")
    public UsersQuery getUserById(@PathVariable UUID id) {
        return usersQueryAppService.getById(id);
    }
}
