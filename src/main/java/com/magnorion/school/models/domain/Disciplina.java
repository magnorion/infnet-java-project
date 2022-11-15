package com.magnorion.school.models.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Entity
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private LocalDateTime data;
    private String descricao;
    private Curso curso;

    private Professor professor;

    private ArrayList<Aluno> alunos;

    private Monitor monitor;

    public Disciplina(String nome, LocalDateTime data, String descricao, Curso curso, Professor professor, Monitor monitor) {
        this.nome = nome;
        this.data = data;
        this.descricao = descricao;
        this.curso = curso;
        this.professor = professor;
        this.monitor = monitor;

        // inicia vazio
        this.alunos = new ArrayList<>();
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

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
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

        return this.nome + "," + this.data.toString() + "," + this.descricao + "\nMateria: " + this.curso.toString() + "\n"
                + "Professor: " + this .professor + "\nMonitor" + this.monitor + "\nEstudantes: " + dadosAlunos;
    }
}
