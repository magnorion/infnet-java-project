package com.magnorion.school.models.domain;

public class Materia {
    private String nome;
    private float nota;
    private String descricao;

    private Professor professor;

    public Materia(String nome, float nota, String descricao, Professor professor) {
        this.nome = nome;
        this.nota = nota;
        this.descricao = descricao;
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        return this.nome + "," + this.nota + "," + this.descricao + "," + "\nProfessor: " + this.professor.toString();
    }
}
