alter table topicos drop column respuestas;
alter table topicos add respuesta SERIAL references respuestas(id);