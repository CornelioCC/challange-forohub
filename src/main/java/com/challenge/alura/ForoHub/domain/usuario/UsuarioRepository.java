package com.challenge.alura.ForoHub.domain.usuario;

import com.challenge.alura.ForoHub.domain.topicos.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
