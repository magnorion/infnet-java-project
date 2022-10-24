package com.magnorion.school.models.domain;

import java.time.LocalDateTime;

public class Nota {
    private float valor;
    private String descricao;
    private LocalDateTime data;

    private Materia materia;
    private Aluno aluno;

    public Nota(float valor, String descricao, LocalDateTime data, Materia materia, Aluno aluno) {
        this.valor = valor;
        this.descricao = descricao;
        this.data = data;
        this.materia = materia;
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return this.valor + "," + this.descricao + "," + this.data.toString() + "," + "\nMateria: " + this.materia
                + "\nAluno: " + this.aluno.toString();
    }
}
