package com.challenge.alura.ForoHub.domain.curso;

import com.challenge.alura.ForoHub.domain.topicos.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    Curso getByNombre(String curso);
}
