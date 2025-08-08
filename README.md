<h1>Challenge ForoHub</h1>

<h4>Solicitud /login</h4>

- `Recibe solicitudes POST`
  
- `Recibe un objeto JSON con los datos del usuario que solicita acceso. Ejemplo: `
-  {
	"nombre":"Administrador",
	"contra":"12345678"
}
- `Devuelve un JSON con el token generado. Ejemplo: `
- {
	"jwTtoken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiQWRtaW5pc3RyYWRvciIsImlkIjoxLCJleHAiOjE3NTQ2Mjk5NTR9.hGRe1x53vVtRBqaX4Q5pD3UyXvMBszFtr1FwDYwlXIc"
}

<h4>Solicitudes /topicos</h4>

-`Metodo GET sin atributos`
No recibe ningun atributo u objeto, funciona sin necesidad de hacer login, devuelve un objeto JSON con todos los topicos, los atributos devueltos son id, titulo, mensaje y fecha de creacion:
{
		"id": 1,
		"titulo": "",
		"mensaje": "",
		"fechaCreacion": ""
	}

-`Metodo GET con atributo "id"`
Recibe el id del topico que se desea consultar, devuelve un objeto JSON, los atributos devueltos son id, titulo, mensaje y fecha de creacion. Necesario hacer login para consultar.

-`Metodo POST`
Recibe un objeto JSON con los atributos solicitados por el DTO correspondiente, los cuales son idUsuario, titulo, mensaje y nombreCursos. Estos campos son obligatorios por lo que no se registrara si no son enviados correctamente, esto incluye que el usuario y curso efectivamente existan.
Necesario hacer login para realizar.
	{
		"idUsuario": 1,
		"titulo": "",
		"mensaje": "",
		"nombreCurso": ""
	}

-`Metodo PUT con atributo "id"`
Recibe un objeto JSON con los atributos que es permitido modificar los cuales son titulo, mensaje, nombreCurso. Solo se cambiaran los campos que se incluyan por lo que no es necesario enviar todos, solo los que se desea modificar.
Necesario hacer login para realizar.
{
		"titulo": "Error 400 con actu",
		"mensaje": "Se recibe un error del servidor cuando se realiza una solicitud POST prueba actaulizacion",
	"nombreCurso": "Desarrollo API Rest"
	}

-`Metodo DELETE con atributo "id"`
Recibe el id del topico que se desea elminar. No regresa ningun objeto. Si el eliminado fue exitoso se regresa un 204. 
Necesario hacer login para realizar.


<h5>Autor</h5>
<h6>Cornelio Cano Castro</h6>
