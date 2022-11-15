package com.magnorion.school.repository;

import com.magnorion.school.models.domain.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Integer> {
}
