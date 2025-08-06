package com.challenge.alura.ForoHub.domain.topicos;

public record DTOTopicoSalida(
        Long id,
        String titulo,
        String mensaje,
        String fechaCreacion
) {
    public DTOTopicoSalida(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion());
    }
}
