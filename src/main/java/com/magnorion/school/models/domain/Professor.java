package com.magnorion.school.models.domain;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Professor extends Participante {
    private LocalDateTime dataContrato;

    public Professor(String nome, String telefone, String email, Integer idade, LocalDateTime dataContrato) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.idade = idade;
        this.dataContrato = dataContrato;
    }

    public LocalDateTime getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDateTime dataContrato) {
        this.dataContrato = dataContrato;
    }

    @Override
    public String toString() {
        return this.nome + "," + this.telefone + "," + this.email + "," + this.idade + "," + this.dataContrato.toString();
    }
}
