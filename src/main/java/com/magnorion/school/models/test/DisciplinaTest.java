package com.magnorion.school.models.test;

import com.magnorion.school.models.domain.Aluno;
import com.magnorion.school.models.domain.Curso;
import com.magnorion.school.models.domain.Disciplina;
import com.magnorion.school.models.domain.Monitor;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class DisciplinaTest {
    public static void main(String[] args) {
        ArrayList<Curso> cursos = CursoTest.createMateria();
        ArrayList<Aluno> alunos = AlunoTest.createAlunos();
        ArrayList<Monitor> monitores = MonitorTest.createMonitor();

        Disciplina disciplinaA = new Disciplina(
                "Turma A",
                LocalDateTime.now(),
                "Criacao da Turma A",
                cursos.get(0),
                cursos.get(0).getProfessor(),
                monitores.get(0));

        Disciplina disciplinaB = new Disciplina(
                "Turma B",
                LocalDateTime.now(),
                "Criacao Turma B",
                cursos.get(1),
                cursos.get(1).getProfessor(),
                monitores.get(1));

        Disciplina disciplinaC = new Disciplina(
                "Turma C",
                LocalDateTime.now(),
                "Criacao Turma C",
                cursos.get(2),
                cursos.get(2).getProfessor(),
                monitores.get(2));

        disciplinaA.addEstudante(alunos.get(0));
        disciplinaB.addEstudante(alunos.get(0));
        disciplinaC.addEstudante(alunos.get(0));

        System.out.println(disciplinaA.toString());
        System.out.println(disciplinaB.toString());
        System.out.println(disciplinaC.toString());
    }
}
