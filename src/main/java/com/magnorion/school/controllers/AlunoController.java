package com.magnorion.school.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.magnorion.school.models.domain.Aluno;
import com.magnorion.school.models.test.AlunoTest;

@Controller
public class AlunoController {
  
  @RequestMapping(value = "/aluno/lista", method = RequestMethod.GET)
  public String telaLista(ModelMap model) {
    ArrayList<Aluno> alunos = AlunoTest.createAlunos();

    model.addAttribute("title", "Lista de alunos");
    model.addAttribute("alunos", alunos);

    return "alunos/lista";
  }
}
