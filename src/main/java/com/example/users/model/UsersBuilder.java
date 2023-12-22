package com.example.users.model;

import com.example.sk.identifiers.UsersId;

public class UsersBuilder {

    protected UsersId id;

    protected String nome;

    protected String email;

    protected Integer idade;

    public UsersBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public UsersBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UsersBuilder idade(int idade) {
        this.idade = idade;
        return this;
    }

    public Users build() {

        id = UsersId.generate();

        return new Users(this);
    }
}
