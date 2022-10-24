package com.magnorion.school.models.test;

import com.magnorion.school.models.domain.Materia;
import com.magnorion.school.models.domain.Professor;

import java.util.ArrayList;
import java.util.Arrays;

public class MateriaTest {
    public static ArrayList<Materia> createMateria() {
        ArrayList<Professor> professores = ProfessorTest.createProfessor();
        Materia matematica = new Materia("Matematica", 10, "Materia de matematica", professores.get(0));
        Materia portugues = new Materia("Portugues", 10, "Materia de portugues", professores.get(1));
        Materia filosofia = new Materia("Filosofia", 10, "Materia de filosofia", professores.get(2));

        return new ArrayList<>(Arrays.asList(matematica, portugues, filosofia));
    }

    public static void main(String[] args) {
        ArrayList<Materia> materias = createMateria();

        for (Materia materia : materias) {
            System.out.println(materia.toString());
        }
    }
}
