package com.magnorion.school.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.magnorion.school.models.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    
}
