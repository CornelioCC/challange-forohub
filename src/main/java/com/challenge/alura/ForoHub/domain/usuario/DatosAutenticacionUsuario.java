package com.challenge.alura.ForoHub.domain.usuario;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DatosAutenticacionUsuario(
        @JsonAlias("nombre") String nombre,
        @JsonAlias("contra") String contra) {
}
