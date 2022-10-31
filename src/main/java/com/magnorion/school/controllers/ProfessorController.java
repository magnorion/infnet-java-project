package com.magnorion.school.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.magnorion.school.models.domain.Professor;
import com.magnorion.school.models.test.ProfessorTest;

@Controller
public class ProfessorController {
  @RequestMapping(value = "/professor/lista", method = RequestMethod.GET)
  public String telaLista(ModelMap model) {
    ArrayList<Professor> professores = ProfessorTest.createProfessor();

    model.addAttribute("title", "Lista de professores");
    model.addAttribute("professores", professores);

    return "professores/lista";
  }
}
