package com.magnorion.school.models.test;

import com.magnorion.school.models.domain.Aluno;
import com.magnorion.school.models.domain.Materia;
import com.magnorion.school.models.domain.Turma;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TurmaTest {
    public static void main(String[] args) {
        ArrayList<Materia> materias = MateriaTest.createMateria();
        ArrayList<Aluno> alunos = AlunoTest.createAlunos();

        Turma turmaA = new Turma(
                "Turma A",
                LocalDateTime.now(),
                "Criacao da Turma A",
                materias.get(0),
                materias.get(0).getProfessor());

        Turma turmaB = new Turma(
                "Turma B",
                LocalDateTime.now(),
                "Criacao Turma B",
                materias.get(1),
                materias.get(1).getProfessor());

        Turma turmaC = new Turma(
                "Turma C",
                LocalDateTime.now(),
                "Criacao Turma C",
                materias.get(2),
                materias.get(2).getProfessor());

        turmaA.addEstudante(alunos.get(0));
        turmaB.addEstudante(alunos.get(0));
        turmaC.addEstudante(alunos.get(0));

        System.out.println(turmaA.toString());
        System.out.println(turmaB.toString());
        System.out.println(turmaC.toString());
    }
}
