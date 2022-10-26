package com.magnorion.school.models.domain;

import java.time.LocalDateTime;

public class Monitor extends Participante {
    private LocalDateTime dataMonitor;

    public Monitor(String nome, String telefone, String email, Integer idade, LocalDateTime dataMonitor) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.idade = idade;
        this.dataMonitor = dataMonitor;
    }

    public LocalDateTime getDataMonitor() {
        return dataMonitor;
    }

    public void setDataMonitor(LocalDateTime dataMonitor) {
        this.dataMonitor = dataMonitor;
    }

    @Override
    public String toString() {
        return this.nome + "," + this.telefone + "," + this.email + "," + this.idade + "," + this.dataMonitor.toString();
    }
}
