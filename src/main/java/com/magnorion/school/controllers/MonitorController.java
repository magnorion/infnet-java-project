package com.magnorion.school.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.magnorion.school.models.domain.Monitor;

@Controller
public class MonitorController {
  private static Map<Integer, Monitor> mapaMonitor = new HashMap<>();
  private static Integer id = 1;

  public static void incluir(Monitor monitor) {
    monitor.setId(id);
    mapaMonitor.put(id, monitor);

    id++;
  }
  
  @RequestMapping(value = "/monitor/lista", method = RequestMethod.GET)
  public String telaLista(ModelMap model) {
    model.addAttribute("title", "Lista de monitores");
    model.addAttribute("monitores", mapaMonitor.values());

    return "monitores/lista";
  }

  @RequestMapping(value = "/monitor/{id}/excluir", method = RequestMethod.GET)
  public String exclusao(@PathVariable Integer id, ModelMap model) {
    mapaMonitor.remove(id);

    return "redirect:/monitor/lista";
  }
}
