package com.magnorion.school.repository;

import com.magnorion.school.models.domain.Aluno;
import org.springframework.data.repository.CrudRepository;

public interface AlunoRepository extends CrudRepository<Aluno, Integer> {
}
