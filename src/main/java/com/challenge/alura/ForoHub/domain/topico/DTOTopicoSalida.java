package com.challenge.alura.ForoHub.domain.topico;

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
