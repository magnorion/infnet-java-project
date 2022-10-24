package com.magnorion.school.models.test;

import com.magnorion.school.models.domain.Aluno;
import com.magnorion.school.models.domain.Materia;
import com.magnorion.school.models.domain.Nota;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class NotaTest {
    public static void main(String[] args) {
        ArrayList<Materia> materias = MateriaTest.createMateria();
        ArrayList<Aluno> alunos = AlunoTest.createAlunos();

        Nota nota1 = new Nota(5, "Nota de matematica", LocalDateTime.now(), materias.get(0), alunos.get(0));
        Nota nota2 = new Nota(7, "Nota de portugues", LocalDateTime.now(), materias.get(1), alunos.get(1));
        Nota nota3 = new Nota(10, "Nota de filosofia", LocalDateTime.now(), materias.get(2), alunos.get(2));

        System.out.println(nota1);
        System.out.println(nota2);
        System.out.println(nota3);
    }
}
