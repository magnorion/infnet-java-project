package com.magnorion.school.models.service;

import com.magnorion.school.models.domain.Aluno;
import com.magnorion.school.models.domain.Curso;
import com.magnorion.school.repository.AlunoRepository;
import com.magnorion.school.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CursoService {
    private CursoRepository repository;

    public ArrayList<Curso> obterLista() {
        return (ArrayList<Curso>) this.repository.findAll();
    }

    public Optional<Curso> obterPorId(Integer id) {
        try {
            return this.repository.findById(id);
        } catch (Exception err) {
            System.out.println("Houve um erro ao tentar encontrar o dado");
            return null;
        }
    }

    public void incluir(Curso curso) {
        this.repository.save(curso);
    }

    public void excluir(Integer id) {
        this.repository.deleteById(id);
    }
}