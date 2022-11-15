package com.magnorion.school.models.test;

import com.magnorion.school.controllers.AlunoController;
import com.magnorion.school.models.domain.Aluno;
import com.magnorion.school.models.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;

public class AlunoTest {

    @Autowired
    private AlunoService alunoService;

    public static ArrayList<Aluno> createAlunos() {
        Aluno lucas = new Aluno("Lucas Dias Lopes", "11991829366", "lucas.teste@teste.com", 29, 123123);
        Aluno fernanda = new Aluno("Fernanda Cristina", "123123123", "fernanda@teste.com", 25, 123123);
        Aluno julia = new Aluno("Julia Dias Lopes", "123123123", "julia@teste.com", 18, 123213);

        return new ArrayList<>(Arrays.asList(lucas, fernanda, julia));
    }

    public static void main(String[] args) {
        System.out.println("controlller running...");
    }
}
