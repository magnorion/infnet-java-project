package com.magnorion.school.controllers;

import com.magnorion.school.models.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.magnorion.school.models.domain.Professor;

@Controller
public class ProfessorController {

  @Autowired
  private ProfessorService service;

  public void incluir(Professor professor) {
    this.service.incluir(professor);
  }

  @RequestMapping(value = "/professor/lista", method = RequestMethod.GET)
  public String telaLista(ModelMap model) {
    model.addAttribute("title", "Lista de professores");
    model.addAttribute("professores", this.service.obterLista());

    return "professores/lista";
  }

  @RequestMapping(value = "/professor/{id}/excluir", method = RequestMethod.GET)
  public String exclusao(@PathVariable Long id, ModelMap model) {
    this.service.excluir(id);

    return "redirect:/professor/lista";
  }
}
