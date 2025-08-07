package com.challenge.alura.ForoHub.domain.usuario;


import com.challenge.alura.ForoHub.domain.perfil.Perfil;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "usuarios")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nombre;
    @NotNull
    private String email;
    @NotNull
    private String contra;
    @NotNull
    @ManyToOne
    private Perfil perfil;

}
