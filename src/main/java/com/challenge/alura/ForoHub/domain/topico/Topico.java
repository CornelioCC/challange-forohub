package com.challenge.alura.ForoHub.domain.topico;


import com.challenge.alura.ForoHub.StatusTopico;
import com.challenge.alura.ForoHub.domain.curso.Curso;
import com.challenge.alura.ForoHub.domain.curso.CursoRepository;
import com.challenge.alura.ForoHub.domain.respuesta.Respuesta;
import com.challenge.alura.ForoHub.domain.usuario.Usuario;
import com.challenge.alura.ForoHub.domain.usuario.UsuarioRepository;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Table(name = "topicos")
@Entity
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
    @ManyToOne
    private Curso curso;
    @ManyToOne
    private Usuario autor;
    @OneToMany
    private List<Respuesta> respuestas;



    public Topico(@Valid DTOTopicoRegistro datosTopico, CursoRepository cursoRepository, UsuarioRepository usuarioRepository) {
        this.titulo = datosTopico.titulo();
        this.mensaje = datosTopico.mensaje();
        this.curso = cursoRepository.getByNombre(datosTopico.curso());
        this.fechaCreacion = LocalDate.now().toString();
        this.status = StatusTopico.NO_RESUELTO;
        this.autor = usuarioRepository.getReferenceById(datosTopico.usuario());
    }
}
