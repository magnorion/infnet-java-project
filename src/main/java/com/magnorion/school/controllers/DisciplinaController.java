package com.magnorion.school.controllers;

import com.magnorion.school.models.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.magnorion.school.models.domain.Disciplina;

@Controller
public class DisciplinaController {

  @Autowired
  private DisciplinaService service;

  public void incluir(Disciplina curso) {
    this.service.incluir(curso);
  }

  @RequestMapping(value = "/disciplina/lista", method = RequestMethod.GET)
  public String telaLista(ModelMap model) {
    model.addAttribute("title", "Lista de disciplinas");
    model.addAttribute("disciplinas", this.service.obterLista());

    return "disciplinas/lista";
  }

  @RequestMapping(value = "/disciplina/{id}/excluir", method = RequestMethod.GET)
  public String exclusao(@PathVariable Integer id, ModelMap model) {
    this.service.excluir(id);

    return "redirect:/disciplina/lista";
  }
}
