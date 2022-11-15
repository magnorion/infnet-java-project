package com.magnorion.school.models.service;

import com.magnorion.school.models.domain.Monitor;
import com.magnorion.school.repository.MonitorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MonitorService {

    @Autowired
    private MonitorRepository repository;

    public ArrayList<Monitor> obterLista() {
        return (ArrayList<Monitor>) this.repository.findAll();
    }

    public Optional<Monitor> obterPorId(Long id) {
        try {
            return this.repository.findById(id);
        } catch (Exception err) {
            System.out.println("Houve um erro ao tentar encontrar o dado");
            return null;
        }
    }

    public void incluir(Monitor monitor) {
        this.repository.save(monitor);
    }

    public void excluir(Long id) {
        this.repository.deleteById(id);
    }
}
