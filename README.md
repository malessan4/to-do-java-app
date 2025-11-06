# 📝 To-Do List API

> Una API RESTful robusta y minimalista para la gestión de tareas, desarrollada como proyecto personal para portfolio.

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Spring Boot](https://img.shields.io/badge/spring_boot-%236DB33F.svg?style=for-the-badge&logo=springboot&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)

## 📖 Sobre el Proyecto

Esta aplicación es el backend de una clásica "Lista de Tareas". Fue construida con el propósito didáctico de demostrar la implementación de una arquitectura por capas limpia utilizando **Java 17** y el ecosistema de **Spring Boot 3**.

El proyecto se centra en exponer endpoints claros y seguir las buenas prácticas de desarrollo REST.

### ✨ Funcionalidades Principales

* **CRUD Completo**: Crear, leer (todas o por ID), actualizar y eliminar tareas.
* **Persistencia de Datos**: Uso de H2 (base de datos en memoria) para un desarrollo y pruebas ágiles.
* **Arquitectura Limpia**: Separación clara de responsabilidades (Controller, Service, Repository, Model).

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java 17
* **Framework Principal:** Spring Boot 3.x
* **Gestor de Dependencias:** Maven
* **Base de Datos:** H2 Database (configurable para MySQL/PostgreSQL)
* **Persistencia:** Spring Data JPA (Hibernate)
* **Utilidades:** Lombok (para reducción de boilerplate)

## 🔌 Endpoints de la API

| Método | Endpoint      | Descripción                        |
| :--- | :--- | :--- |
| `GET`    | `/api/tasks`     | Obtener todas las tareas           |
| `GET`    | `/api/tasks/{id}`| Obtener una tarea específica por ID|
| `POST`   | `/api/tasks`     | Crear una nueva tarea              |
| `PUT`    | `/api/tasks/{id}`| Actualizar una tarea existente     |
| `DELETE` | `/api/tasks/{id}`| Eliminar una tarea                 |

## 🚀 Cómo ejecutarlo localmente

**Requisitos:** Tener instalado Java 17 o superior.

1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/malessan4/to-do-java-app.git](https://github.com/malessan4/to-do-java-app.git)
    ```
2.  **Navegar al directorio:**
    ```bash
    cd todo-app
    ```
3.  **Ejecutar la aplicación (usando Maven wrapper):**
    * En Linux/Mac:
        ```bash
        ./mvnw spring-boot:run
        ```
    * En Windows (CMD/PowerShell):
        ```bash
        ./mvnw.cmd spring-boot:run
        ```

La aplicación estará disponible en `http://localhost:8080/api/tasks`.
Se puede probar Swagger: `http://localhost:8080/swagger-ui/index.html`.

> **Nota:** Al usar H2 en memoria, si detienes la aplicación, las tareas creadas se borrarán.

## 🔜 Próximas Mejoras (Roadmap)

* [ ] Migrar base de datos a MySQL o PostgreSQL para persistencia real.
* [ ] Añadir validación de datos (ej: no permitir tareas sin título).
* [ ] Implementar Tests Unitarios con JUnit 5 y Mockito.
* [ ] Documentar la API con Swagger/OpenAPI.

---
Hecho con ☕ y código por [Matias Alessandrello].