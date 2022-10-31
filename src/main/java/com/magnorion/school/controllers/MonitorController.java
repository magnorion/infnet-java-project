package com.magnorion.school.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.magnorion.school.models.domain.Monitor;
import com.magnorion.school.models.test.MonitorTest;

@Controller
public class MonitorController {
  @RequestMapping(value = "/monitor/lista", method = RequestMethod.GET)
  public String telaLista(ModelMap model) {
    ArrayList<Monitor> monitores = MonitorTest.createMonitor();

    model.addAttribute("title", "Lista de monitores");
    model.addAttribute("monitores", monitores);

    return "monitores/lista";
  }
}
