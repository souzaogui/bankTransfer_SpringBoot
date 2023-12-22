package com.example.users.usecase;

import lombok.Builder;
import lombok.Value;

public interface RegisterUsersUseCase {

    void handle(RegisterUsers command);

    @Value
    @Builder
    class RegisterUsers {

        String nome;

        String email;

        Integer idade;
    }
}
