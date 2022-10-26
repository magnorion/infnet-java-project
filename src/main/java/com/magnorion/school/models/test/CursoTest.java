package com.magnorion.school.models.test;

import com.magnorion.school.models.domain.Curso;
import com.magnorion.school.models.domain.Professor;

import java.util.ArrayList;
import java.util.Arrays;

public class CursoTest {
    public static ArrayList<Curso> createMateria() {
        ArrayList<Professor> professores = ProfessorTest.createProfessor();
        Curso matematica = new Curso("Matematica", 10, "Materia de matematica", professores.get(0));
        Curso portugues = new Curso("Portugues", 10, "Materia de portugues", professores.get(1));
        Curso filosofia = new Curso("Filosofia", 10, "Materia de filosofia", professores.get(2));

        return new ArrayList<>(Arrays.asList(matematica, portugues, filosofia));
    }

    public static void main(String[] args) {
        ArrayList<Curso> cursos = createMateria();

        for (Curso curso : cursos) {
            System.out.println(curso.toString());
        }
    }
}
