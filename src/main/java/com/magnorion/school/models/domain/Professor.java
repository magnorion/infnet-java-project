package com.magnorion.school.models.domain;

import java.time.LocalDateTime;

public class Professor extends Pessoa {
    private LocalDateTime dataContrato;

    public Professor(String nome, String telefone, String email, Integer idade, LocalDateTime dataContrato) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.idade = idade;
        this.dataContrato = dataContrato;
    }

    @Override
    public String toString() {
        return this.nome + "," + this.telefone + "," + this.email + "," + this.idade + "," + this.dataContrato.toString();
    }
}
