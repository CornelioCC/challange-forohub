create table topicos(
    id SERIAL PRIMARY KEY,
    titulo varchar(256) not null,
    mensaje varchar(256) not null,
    fechacreacion varchar(100) not null,
    status varchar(50) not null,
    autor bigint references usuarios(id),
    curso bigint references cursos(id),
    respuesta bigint references respuestas(id)
);