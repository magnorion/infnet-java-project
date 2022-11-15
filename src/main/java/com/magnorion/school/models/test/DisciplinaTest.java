package com.magnorion.school.models.test;

import com.magnorion.school.models.domain.Aluno;
import com.magnorion.school.models.domain.Curso;
import com.magnorion.school.models.domain.Disciplina;
import com.magnorion.school.models.domain.Monitor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class DisciplinaTest {

    public static ArrayList<Disciplina> createDisciplina() {
        ArrayList<Curso> cursos = CursoTest.createCurso();
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

        return new ArrayList<>(Arrays.asList(disciplinaA, disciplinaB, disciplinaC));
    }

    public static void main(String[] args) {
    }
}
