package com.challenge.alura.ForoHub.controller;


import com.challenge.alura.ForoHub.domain.curso.CursoRepository;
import com.challenge.alura.ForoHub.domain.topicos.DTOTopicoRegistro;
import com.challenge.alura.ForoHub.domain.topicos.DTOTopicoSalida;
import com.challenge.alura.ForoHub.domain.topicos.Topico;
import com.challenge.alura.ForoHub.domain.topicos.TopicosRepository;
import com.challenge.alura.ForoHub.domain.usuario.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicosRepository topicosRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public ResponseEntity<List<DTOTopicoSalida>> listaTopicos(@PageableDefault(size = 2)Pageable paginacion){

        return ResponseEntity.ok((topicosRepository.findAll().stream().map(DTOTopicoSalida::new).toList()));

    }

    @PostMapping
    public ResponseEntity<DTOTopicoSalida> registrarTopico(@RequestBody @Valid DTOTopicoRegistro datosTopico, UriComponentsBuilder uriComponentsBuilder){
        Topico topic = topicosRepository.save(new Topico(datosTopico, cursoRepository, usuarioRepository));
        DTOTopicoSalida salida =  new DTOTopicoSalida(topic);
        URI url = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(salida.id()).toUri();
        return ResponseEntity.created(url).body(salida);


    }
}
