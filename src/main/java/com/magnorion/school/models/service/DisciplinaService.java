package com.magnorion.school.models.service;

import com.magnorion.school.models.domain.Disciplina;
import com.magnorion.school.repository.DisciplinaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DisciplinaService {
    private DisciplinaRepository repository;

    public ArrayList<Disciplina> obterLista() {
        return (ArrayList<Disciplina>) this.repository.findAll();
    }

    public Optional<Disciplina> obterPorId(Integer id) {
        try {
            return this.repository.findById(id);
        } catch (Exception err) {
            System.out.println("Houve um erro ao tentar encontrar o dado");
            return null;
        }
    }

    public void incluir(Disciplina disciplina) {
        this.repository.save(disciplina);
    }

    public void excluir(Integer id) {
        this.repository.deleteById(id);
    }
}
