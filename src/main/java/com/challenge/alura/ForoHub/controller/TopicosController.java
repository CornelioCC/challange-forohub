package com.challenge.alura.ForoHub.controller;


import com.challenge.alura.ForoHub.domain.topicos.DTOTopicoSalida;
import com.challenge.alura.ForoHub.domain.topicos.Topico;
import com.challenge.alura.ForoHub.domain.topicos.TopicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicosRepository topicosRepository;

    @GetMapping
    public ResponseEntity<List<DTOTopicoSalida>> listaTopicos(@PageableDefault(size = 2)Pageable paginacion){

        return ResponseEntity.ok((topicosRepository.findAll().stream().map(DTOTopicoSalida::new).toList()));

    }
}
