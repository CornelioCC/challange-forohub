package com.challenge.alura.ForoHub.domain.respuesta;


import com.challenge.alura.ForoHub.domain.topico.Topico;
import com.challenge.alura.ForoHub.domain.usuario.Usuario;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "respuestas")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String mensaje;
    @NotNull
    @ManyToOne
    private Topico topico;
    private String fechaCreacion;
    @NotNull
    @ManyToOne
    private Usuario autor;
    @NotNull
    private String solucion;
}
