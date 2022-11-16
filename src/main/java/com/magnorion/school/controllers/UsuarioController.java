package com.magnorion.school.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.magnorion.school.models.domain.Usuario;
import com.magnorion.school.models.dto.Login;
import com.magnorion.school.models.service.UsuarioService;

@Controller
public class UsuarioController {
    private Usuario usuario = null;
    
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
        
        return "redirect:/";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String telaLogin(ModelMap model) {
        this.usuario = null;
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Login login) {
        this.usuario = this.service.login(login);

        return "redirect:/home";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String telaHome(ModelMap model) {
        model.addAttribute("usuario", this.usuario);

        return "home";
    }

    @RequestMapping(value = "/usuario/lista", method = RequestMethod.GET)
    public String telaLista(ModelMap model) {
        model.addAttribute("title", "Lista de alunos");
        model.addAttribute("usuarios", this.service.obterLista());

        return "usuario/lista";
    }

    @RequestMapping(value = "/usuario/{id}/excluir", method = RequestMethod.GET)
    public String exclusao(@PathVariable Long id, ModelMap model) {
        this.service.excluir(id);

        return "redirect:/usuario/lista";
    }
}
