package com.magnorion.school.models.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magnorion.school.models.domain.Usuario;
import com.magnorion.school.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository repository;

    public void incluir(Usuario usuario) {
        this.repository.save(usuario);
    }

    public ArrayList<Usuario> listaUsurios() {
        return (ArrayList<Usuario>) this.repository.findAll();
    }
}
