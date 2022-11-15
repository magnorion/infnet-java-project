package com.magnorion.school.controllers;

import java.util.HashMap;
import java.util.Map;

import com.magnorion.school.models.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.magnorion.school.models.domain.Aluno;

@Controller
public class AlunoController {

  @Autowired
  private AlunoService alunoService;

  public void incluir(Aluno aluno) {
    this.alunoService.incluir(aluno);
  }
  
  @RequestMapping(value = "/aluno/lista", method = RequestMethod.GET)
  public String telaLista(ModelMap model) {
    model.addAttribute("title", "Lista de alunos");
    model.addAttribute("alunos", this.alunoService.obterLista());

    return "alunos/lista";
  }

  @RequestMapping(value = "/aluno/{id}/excluir", method = RequestMethod.GET)
  public String exclusao(@PathVariable Integer id, ModelMap model) {
    this.alunoService.excluir(id);
    
    return "redirect:/aluno/lista";
  }
}
