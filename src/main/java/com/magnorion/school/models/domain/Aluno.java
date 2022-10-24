package com.magnorion.school.models.domain;

public class Aluno extends Pessoa {
    private Integer registro;

    public Aluno(String nome, String telefone, String email, Integer idade, Integer registro) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.idade = idade;
        this.registro = registro;
    }

    @Override
    public String toString() {
        return this.nome + "," + this.telefone + "," + this.email + "," + this.idade + "," + this.registro;
    }
}
