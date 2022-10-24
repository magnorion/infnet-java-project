package com.magnorion.school.models.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Turma {
    private String nome;
    private LocalDateTime data;
    private String descricao;
    private Materia materia;

    private Professor professor;

    private ArrayList<Aluno> alunos;

    public Turma (String nome, LocalDateTime data, String descricao, Materia materia, Professor professor) {
        this.nome = nome;
        this.data = data;
        this.descricao = descricao;
        this.materia = materia;
        this.professor = professor;

        // inicia vazio
        this.alunos = new ArrayList<>();
    }

    public void addEstudante(Aluno aluno) {
        this.alunos.add(aluno);
    }

    @Override
    public String toString() {
        String dadosAlunos = this.alunos
                .stream()
                .map(aluno -> aluno.toString() + "\n")
                .collect(Collectors.joining());

        return this.nome + "," + this.data.toString() + "," + this.descricao + "\nMateria: " + this.materia.toString() + "\n"
                + "Professor: " + this .professor + "\nEstudantes: " + dadosAlunos;
    }
}
