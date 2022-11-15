package com.magnorion.school.models.service;

import com.magnorion.school.models.domain.Aluno;
import com.magnorion.school.repository.AlunoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.*;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public ArrayList<Aluno> obterLista() {
        return (ArrayList<Aluno>) this.repository.findAll();
    }

    public Optional<Aluno> obterPorId(Long id) {
        try {
            return this.repository.findById(id);
        } catch (Exception err) {
            System.out.println("Houve um erro ao tentar encontrar o aluno");
            return null;
        }
    }

    public void incluir(Aluno aluno) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        aluno.setRegistro(timestamp.getNanos());
        this.repository.save(aluno);
    }

    public void excluir(Long id) {
        this.repository.deleteById(id);
    }
}
