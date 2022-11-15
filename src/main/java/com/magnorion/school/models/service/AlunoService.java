package com.magnorion.school.models.service;

import com.magnorion.school.models.domain.Aluno;
import com.magnorion.school.repository.AlunoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public ArrayList<Aluno> obterLista() {
        return (ArrayList<Aluno>) this.repository.findAll();
    }

    public Optional<Aluno> obterPorId(Integer id) {
        try {
            return this.repository.findById(id);
        } catch (Exception err) {
            System.out.println("Houve um erro ao tentar encontrar o aluno");
            return null;
        }
    }

    public void incluir(Aluno aluno) {
        this.repository.save(aluno);
    }

    public void excluir(Integer id) {
        this.repository.deleteById(id);
    }
}
