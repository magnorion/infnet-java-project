package com.magnorion.school.models.test;

import com.magnorion.school.models.domain.Professor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class ProfessorTest {
    public static ArrayList<Professor> createProfessor() {
        Professor paulo = new Professor("Paulo", "99123123", "paulo.teste@teste.com", 53, LocalDateTime.now());
        Professor joao = new Professor("Joao", "2131245444", "joao@teste.com", 42, LocalDateTime.now());
        Professor cleber = new Professor("Cleber", "1235454", "cleber@teste.com", 32, LocalDateTime.now());

        return new ArrayList<>(Arrays.asList(paulo, joao, cleber));
    }

    public static void main(String[] args) {
        ArrayList<Professor> professores = createProfessor();

        for (Professor professor : professores) {
            System.out.println(professor.toString() + "\n");
        }
    }
}
