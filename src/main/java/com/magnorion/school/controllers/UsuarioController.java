package com.magnorion.school.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.magnorion.school.models.domain.Usuario;
import com.magnorion.school.models.service.UsuarioService;

@Controller
public class UsuarioController {
    
    @Autowired
    private UsuarioService service;

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String cadastrar(ModelMap model) {
        model.addAttribute("title", "Cadastro de usuario");

        return "signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String incluir(Usuario usuario) {
        this.service.incluir(usuario);
        
        return "redirect:/signup";
    }
}
