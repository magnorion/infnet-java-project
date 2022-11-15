package com.magnorion.school.controllers;

import java.util.HashMap;
import java.util.Map;

import com.magnorion.school.models.service.CursoService;
import com.magnorion.school.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.magnorion.school.models.domain.Curso;

@Controller
public class CursoController {

  @Autowired
  private CursoService service;

  public void incluir(Curso curso) {
    this.service.incluir(curso);
  }

  @RequestMapping(value = "/curso/lista", method = RequestMethod.GET)
  public String telaLista(ModelMap model) {

    model.addAttribute("title", "Lista de cursos");
    model.addAttribute("cursos", this.service.obterLista());

    return "cursos/lista";
  }

  @RequestMapping(value = "/curso/{id}/excluir", method = RequestMethod.GET)
  public String exclusao(@PathVariable Integer id, ModelMap model) {
    this.service.excluir(id);

    return "redirect:/curso/lista";
  }
}
