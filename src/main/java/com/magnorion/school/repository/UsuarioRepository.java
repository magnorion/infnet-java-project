package com.magnorion.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.magnorion.school.models.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query("from Usuario WHERE email = :email AND senha = :senha")
    public Usuario findByUserByLogin(@Param("email") String email, @Param("senha") String senha);
}
