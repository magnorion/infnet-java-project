package com.magnorion.school.models.domain;

import javax.persistence.Entity;

@Entity
public class Aluno extends Participante {
    private Integer registro;

    public Aluno() { }

    public Aluno(String nome, String telefone, String email, Integer idade, Integer registro) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.idade = idade;
        this.registro = registro;
    }

    public Integer getRegistro() {
        return registro;
    }

    public void setRegistro(Integer registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return this.nome + "," + this.telefone + "," + this.email + "," + this.idade + "," + this.registro;
    }
}
