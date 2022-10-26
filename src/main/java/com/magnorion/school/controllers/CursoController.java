package com.magnorion.school.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CursoController {
  @RequestMapping(value = "/curso/lista", method = RequestMethod.GET)
  public String telaLista(ModelMap model) {
    return "lista";
  }
}
