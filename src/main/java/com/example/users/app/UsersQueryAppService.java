package com.example.users.app;

import com.example.users.model.UsersQuery;
import com.example.users.repository.UsersQueryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
@Transactional
public class UsersQueryAppService {

    private final UsersQueryRepository usersQueryRepository;

    public List<UsersQuery> getAll() {
        return (List<UsersQuery>) usersQueryRepository.findAll();
    }

    public UsersQuery getById(UUID id) {
        return usersQueryRepository.get(id);
    }

}
