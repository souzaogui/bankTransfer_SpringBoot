package com.example.users.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor

@Entity(name = "UsersQuery")
@Table(name = "usuarios")
public class UsersQuery {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "idade")
    private Integer idade;

    public static class UserIdNotFound extends RuntimeException {
        private static final long serialVersionUUID = 2321457231298231298L;
    }
}