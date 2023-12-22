package com.example.users.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.users.model.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, Integer> {
}
