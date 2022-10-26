package com.magnorion.school.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.magnorion.school.models.domain.Disciplina;
import com.magnorion.school.models.test.DisciplinaTest;

@Controller
public class DisciplinaController {
  @RequestMapping(value = "/disciplina/lista", method = RequestMethod.GET)
  public String telaLista(ModelMap model) {
    ArrayList<Disciplina> disciplinas = DisciplinaTest.createDisciplina();

    model.addAttribute("title", "Lista de disciplinas");
    model.addAttribute("disciplinas", disciplinas);

    return "lista";
  }
}
