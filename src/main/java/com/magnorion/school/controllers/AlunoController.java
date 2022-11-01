package com.magnorion.school.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.magnorion.school.models.domain.Aluno;

@Controller
public class AlunoController {
  private static Map<Integer, Aluno> mapaAluno = new HashMap<>();
  private static Integer id = 1;

  public static void incluir(Aluno aluno) {
    aluno.setId(id);
    mapaAluno.put(id, aluno);

    id++;
  }
  
  @RequestMapping(value = "/aluno/lista", method = RequestMethod.GET)
  public String telaLista(ModelMap model) {
    model.addAttribute("title", "Lista de alunos");
    model.addAttribute("alunos", mapaAluno.values());

    return "alunos/lista";
  }

  @RequestMapping(value = "/aluno/{id}/excluir", method = RequestMethod.GET)
  public String exclusao(@PathVariable Integer id, ModelMap model) {
    mapaAluno.remove(id);
    
    return "redirect:/aluno/lista";
  }
}
