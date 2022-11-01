package com.magnorion.school.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.magnorion.school.models.domain.Professor;

@Controller
public class ProfessorController {
  private static Map<Integer, Professor> mapaProfessor = new HashMap<>();
  private static Integer id = 1;

  public static void incluir(Professor professor) {
    professor.setId(id);
    mapaProfessor.put(id, professor);

    id++;
  }

  @RequestMapping(value = "/professor/lista", method = RequestMethod.GET)
  public String telaLista(ModelMap model) {
    model.addAttribute("title", "Lista de professores");
    model.addAttribute("professores", mapaProfessor.values());

    return "professores/lista";
  }

  @RequestMapping(value = "/professor/{id}/excluir", method = RequestMethod.GET)
  public String exclusao(@PathVariable Integer id, ModelMap model) {
    mapaProfessor.remove(id);

    return "redirect:/professor/lista";
  }
}
