package com.magnorion.school.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class AppController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String telaHome(ModelMap model) {
        return "home";
    }
}
