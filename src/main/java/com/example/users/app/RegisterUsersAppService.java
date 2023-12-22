package com.example.users.app;

import com.example.users.model.Users;
import com.example.users.repository.UsersRepository;
import com.example.users.usecase.RegisterUsersUseCase;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor

@Service
@Transactional
public class RegisterUsersAppService implements RegisterUsersUseCase {

    private final UsersRepository usersRepository;

    @Override
    public void handle(RegisterUsers command) {
        Users user = Users.builder()
                .nome(command.getNome())
                .email(command.getEmail())
                .idade(command.getIdade())
                .build();

        usersRepository.save(user);
    }
}
