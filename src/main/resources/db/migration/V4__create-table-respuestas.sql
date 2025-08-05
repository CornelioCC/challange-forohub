create table respuestas(
    id SERIAL PRIMARY KEY,
    mensaje varchar(256) not null,
    topico varchar(256) not null,
    fechacreacion varchar(100) not null,
    autor bigint references usuarios(id),
    solucion varchar(256) not null
);