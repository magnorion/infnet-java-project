package com.magnorion.school.models.service;

import com.magnorion.school.models.domain.Aluno;
import com.magnorion.school.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AlunoService {
    private static Map<Integer, Aluno> mapaAluno = new HashMap<>();
    private static Integer id = 1;

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
