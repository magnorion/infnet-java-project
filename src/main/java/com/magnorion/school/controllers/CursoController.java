package com.magnorion.school.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.magnorion.school.models.domain.Curso;

@Controller
public class CursoController {
  private static Map<Integer, Curso> mapaCurso = new HashMap<>();
  private static Integer id = 1;

  public static void incluir(Curso curso) {
    curso.setId(id);
    mapaCurso.put(id, curso);

    id++;
  }

  @RequestMapping(value = "/curso/lista", method = RequestMethod.GET)
  public String telaLista(ModelMap model) {

    model.addAttribute("title", "Lista de cursos");
    model.addAttribute("cursos", mapaCurso.values());

    return "cursos/lista";
  }

  @RequestMapping(value = "/curso/{id}/excluir", method = RequestMethod.GET)
  public String exclusao(@PathVariable Integer id, ModelMap model) {
    mapaCurso.remove(id);

    return "redirect:/curso/lista";
  }
}
