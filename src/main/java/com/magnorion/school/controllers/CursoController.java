package com.magnorion.school.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.magnorion.school.models.domain.Curso;
import com.magnorion.school.models.test.CursoTest;

@Controller
public class CursoController {
  @RequestMapping(value = "/curso/lista", method = RequestMethod.GET)
  public String telaLista(ModelMap model) {
    ArrayList<Curso> cursos = CursoTest.createCurso();

    model.addAttribute("title", "Lista de cursos");
    model.addAttribute("cursos", cursos);

    return "cursos/lista";
  }
}
