package com.example.users.repository;

import com.example.users.model.UsersQuery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsersQueryRepository extends CrudRepository<UsersQuery, UUID> {

    Optional<UsersQuery> findById(UUID id);

    default UsersQuery get(UUID id) {
        return findById(id)
                .orElseThrow(UsersQuery.UserIdNotFound::new);
    }

}
