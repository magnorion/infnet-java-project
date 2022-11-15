package com.magnorion.school.controllers;

import com.magnorion.school.models.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.magnorion.school.models.domain.Monitor;

@Controller
public class MonitorController {

  @Autowired
  private MonitorService service;

  public void incluir(Monitor monitor) {
    this.service.incluir(monitor);
  }
  
  @RequestMapping(value = "/monitor/lista", method = RequestMethod.GET)
  public String telaLista(ModelMap model) {
    model.addAttribute("title", "Lista de monitores");
    model.addAttribute("monitores", this.service.obterLista());

    return "monitores/lista";
  }

  @RequestMapping(value = "/monitor/{id}/excluir", method = RequestMethod.GET)
  public String exclusao(@PathVariable Long id, ModelMap model) {
    this.service.excluir(id);

    return "redirect:/monitor/lista";
  }
}
