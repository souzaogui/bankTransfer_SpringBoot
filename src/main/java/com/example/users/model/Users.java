package com.example.users.model;

import com.example.sk.identifiers.UsersId;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static java.util.Objects.requireNonNull;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)

@Entity
@Table(name = "usuarios")
public class Users {

    @EmbeddedId
    @AttributeOverride(name = UsersId.ATTR, column = @Column(name = "id"))
    private UsersId id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "idade")
    private Integer idade;

    Users(UsersBuilder builder) {
        this.id = requireNonNull(builder.id);
        this.nome = requireNonNull(builder.nome);
        this.email = requireNonNull(builder.email);
        this.idade = requireNonNull(builder.idade);
    }

    public static UsersBuilder builder() {
        return new UsersBuilder();
    }

}