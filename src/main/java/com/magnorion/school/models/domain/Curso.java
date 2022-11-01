package com.magnorion.school.models.domain;

public class Curso {
    private int id;
    private String nome;
    private float nota;
    private String descricao;

    private Professor professor;

    public Curso(String nome, float nota, String descricao, Professor professor) {
        this.nome = nome;
        this.nota = nota;
        this.descricao = descricao;
        this.professor = professor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setProfessor(Professor professor) {
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
