package com.magnorion.school.models.test;

import com.magnorion.school.controllers.MonitorController;
import com.magnorion.school.models.domain.Aluno;
import com.magnorion.school.models.domain.Monitor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class MonitorTest {
    public static ArrayList<Monitor> createMonitor() {
        Monitor monitor1 =
                new Monitor("Lucas Dias Lopes", "11991829366", "lucas.teste@teste.com", 29, LocalDateTime.now());
        Monitor monitor2 =
                new Monitor("Julia Dias", "11991829366", "lucas.teste@teste.com", 29, LocalDateTime.now());
        Monitor monitor3 =
                new Monitor("Fernanda Cristina", "11991829366", "lucas.teste@teste.com", 29, LocalDateTime.now());

        return new ArrayList<>(Arrays.asList(monitor1, monitor2, monitor3));
    }


    public static void main(String[] args) {
        ArrayList<Monitor> monitores = createMonitor();

        for (Monitor monitor : monitores) {
            MonitorController.incluir(monitor);
            System.out.println(monitor.toString());
        }
    }
}
