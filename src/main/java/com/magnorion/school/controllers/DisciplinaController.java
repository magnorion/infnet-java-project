package com.magnorion.school.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.magnorion.school.models.domain.Disciplina;

@Controller
public class DisciplinaController {
  private static Map<Integer, Disciplina> mapaDisciplina = new HashMap<>();
  private static Integer id = 1;

  public static void incluir(Disciplina curso) {
    curso.setId(id);
    mapaDisciplina.put(id, curso);

    id++;
  }

  @RequestMapping(value = "/disciplina/lista", method = RequestMethod.GET)
  public String telaLista(ModelMap model) {
    model.addAttribute("title", "Lista de disciplinas");
    model.addAttribute("disciplinas", mapaDisciplina.values());

    return "disciplinas/lista";
  }

  @RequestMapping(value = "/disciplina/{id}/excluir", method = RequestMethod.GET)
  public String exclusao(@PathVariable Integer id, ModelMap model) {
    mapaDisciplina.remove(id);

    return "redirect:/disciplina/lista";
  }
}
