create table usuarios(
    id SERIAL PRIMARY KEY,
    nombre varchar(100) not null unique,
    email varchar(256) not null unique,
    contra varchar(256) not null,
    perfil bigint references perfiles(id)
);