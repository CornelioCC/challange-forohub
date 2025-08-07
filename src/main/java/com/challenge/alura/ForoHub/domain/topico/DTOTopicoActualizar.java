package com.challenge.alura.ForoHub.domain.topico;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public record DTOTopicoActualizar (
        @JsonAlias("mensaje") String mensaje,
        @JsonAlias("nombreCurso") String curso,
        @JsonAlias("titulo") String titulo
){
}
