package com.challenge.alura.ForoHub.domain.topicos;


import com.challenge.alura.ForoHub.StatusTopico;
import com.challenge.alura.ForoHub.domain.curso.Curso;
import com.challenge.alura.ForoHub.domain.respuesta.Respuesta;
import com.challenge.alura.ForoHub.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String fechaCreacion;
    @Enumerated(EnumType.STRING)
    private StatusTopico status;
    @Embedded
    private Usuario autor;
    @Embedded
    private Curso curso;
    @Embedded
    private Respuesta respuestas;








}
