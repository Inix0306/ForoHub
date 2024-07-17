# API REST para Foro usando Spring Boot

Este proyecto implementa una API REST para un foro utilizando Spring Boot. Permite la gestión de tópicos, incluyendo la creación, listado y eliminación, con seguridad implementada mediante JWT (JSON Web Token).

## Tecnologías Utilizadas

- Java 11
- Spring Boot 2.5.5
- Spring Data JPA
- Spring Security con JWT
- PostgreSQL
- Maven

## Configuración del Proyecto

1. **Configuración de la Base de Datos**

   Asegúrate de tener PostgreSQL instalado y configurado. Luego, modifica el archivo `application.properties` ubicado en `src/main/resources` con tus credenciales de base de datos:

   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/forum_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
   spring.jpa.hibernate.ddl-auto=update
   
2. **Ejecución del Proyecto**

Clona este repositorio y ejecuta el proyecto utilizando Maven:
mvn spring-boot:run

El servidor se ejecutará en http://localhost:8080.

## Endpoints Disponibles

Listar Todos los Tópicos
  URL: /api/topics
  Método HTTP: GET
  Descripción: Retorna todos los tópicos existentes en el foro.
  
## Crear un Nuevo Tópico

  URL: /api/topics
  Método HTTP: POST
  Descripción: Crea un nuevo tópico en el foro.
  Body: Debe contener un JSON con los datos del tópico a crear
  {
  "title": "Título del Tópico",
  "message": "Mensaje del Tópico",
  "course": "Curso Relacionado",
  "userId": 1
}
      title: Título del tópico.
      message: Mensaje o contenido del tópico.
      course: Curso relacionado con el tópico.
      userId: ID del usuario que crea el tópico.
      
## Eliminar un Tópico

URL: /api/topics/{id}
Método HTTP: DELETE
Descripción: Elimina el tópico con el ID especificado.
Parámetros de la URL: {id} - ID del tópico a eliminar.

## Seguridad con JWT
La seguridad está implementada utilizando JSON Web Tokens (JWT). Para crear y validar tokens JWT, se utilizan las siguientes clases:

   JwtTokenProvider: Clase para la creación, validación y obtención de información del token.
   JwtConfigurer: Configuración de Spring Security para integrar JWT.
   
## Prueba con Insomnia
Se recomienda usar Insomnia o una herramienta similar para probar los endpoints de la API REST. Aquí está cómo configurar Insomnia para trabajar con esta API:

      1.Crear un Nuevo Request: Crea un nuevo request para cada uno de los endpoints descritos.
      2.Configurar Headers: Agrega un header Content-Type con valor application/json para las peticiones POST y DELETE.
      3.Enviar Peticiones: Envía peticiones a los endpoints para probar la funcionalidad.


Este README proporciona una guía estructurada para configurar, ejecutar, probar y comprender el proyecto de API REST para un foro usando Spring Boot. Asegúrate de ajustar los detalles específicos según tu implementación y agregar más secciones o información según sea necesario.
