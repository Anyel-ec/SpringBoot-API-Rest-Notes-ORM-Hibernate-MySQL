# **Select Language:** 🌍
- [Español (Spanish)](README-es.md)
- [English](README.md)

# Hibernate Project with Spring Boot

This project implements a RESTful API using Hibernate and Spring Boot for managing notes.
## RESULTS
### Swagger Documentation
![Alt text](api_doc/doc_api.png)
## Estructura del Proyecto
## Project Structure

The project is organized into several packages:

- `models`: Contains JPA entities for notes.
- `exceptions`: Defines custom exceptions to handle errors.
- `controller`: Contains REST controllers to manipulate notes and documentation.
- `config`: Project configuration, including OpenAPI configuration.

## Features

- **Notes (`NoteAppd`)**: Allows creation, updating, deletion, and retrieval of notes.
- **Exception Handling**: Custom exceptions are used to handle resource not found scenarios.
- **Documentation**: Uses Swagger for API documentation.

## Main Endpoints

- `GET /api/notes`: Retrieves all notes.
- `POST /api/notes`: Creates a new note.
- `GET /api/notes/{id}`: Retrieves a note by its ID.
- `PUT /api/notes/{id}`: Updates an existing note.
- `DELETE /api/notes/{id}`: Deletes a note by its ID.
- `GET /doc/`: Redirects to Swagger documentation.

## Configuration

- Swagger configuration is available in `OpenApiConfig.java`.
- The application utilizes entity auditing with Spring Data JPA.

## Documentation

To view the API documentation, access `/swagger-ui.html` in your browser.

## Contact

Developed by Anyel EC.
Email: cyberdevmatrix@gmail.com

