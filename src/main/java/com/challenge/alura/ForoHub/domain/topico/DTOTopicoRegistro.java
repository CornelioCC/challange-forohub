package com.challenge.alura.ForoHub.domain.topico;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DTOTopicoRegistro(
        @JsonAlias("mensaje") String mensaje,
        @JsonAlias("nombreCurso") String curso,
        @JsonAlias("titulo") String titulo,
        @JsonAlias("idUsuario") Long usuario
) {
}
