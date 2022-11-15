package com.magnorion.school.models.service;

import com.magnorion.school.models.domain.Professor;
import com.magnorion.school.repository.ProfessorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repository;

    public ArrayList<Professor> obterLista() {
        return (ArrayList<Professor>) this.repository.findAll();
    }

    public Optional<Professor> obterPorId(Long id) {
        try {
            return this.repository.findById(id);
        } catch (Exception err) {
            System.out.println("Houve um erro ao tentar encontrar o dado");
            return null;
        }
    }

    public void incluir(Professor professor) {
        this.repository.save(professor);
    }

    public void excluir(Long id) {
        this.repository.deleteById(id);
    }
}
