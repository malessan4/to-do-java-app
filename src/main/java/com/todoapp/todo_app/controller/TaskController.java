package com.todoapp.todo_app.controller;

import com.todoapp.todo_app.model.Task;
import com.todoapp.todo_app.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/tasks") // Define la URL base para todas las peticiones de este controlador
@CrossOrigin(origins = "*") // Permite que cualquiera (ej. tu futuro frontend en React) haga peticiones aquí
public class TaskController {

    @Autowired
    private TaskService taskService;

    // GET /api/tasks -> Devuelve todas las tareas
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    // GET /api/tasks/{id} -> Devuelve una tarea específica por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id)
                .map(task -> ResponseEntity.ok(task)) // Si existe, devuelve código 200 OK y la tarea
                .orElse(ResponseEntity.notFound().build()); // Si no existe, devuelve código 404 Not Found
    }

    // POST /api/tasks -> Crea una nueva tarea con los datos que vienen en el cuerpo
    // (body) de la petición
    @PostMapping
    public Task createTask(@Valid @RequestBody Task task) {
        return taskService.createTask(task);
    }

    // PUT /api/tasks/{id} -> Actualiza una tarea existente
    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task taskDetails) {
        try {
            Task updatedTask = taskService.updateTask(id, taskDetails);
            return ResponseEntity.ok(updatedTask); // 200 OK con la tarea actualizada
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build(); // 404 Not Found si el ID no existía
        }
    }

    // DELETE /api/tasks/{id} -> Borra una tarea
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.noContent().build(); // 204 No Content (éxito, pero sin cuerpo de respuesta)
    }
}