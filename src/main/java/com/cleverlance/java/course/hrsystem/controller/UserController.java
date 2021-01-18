package com.cleverlance.java.course.hrsystem.controller;

import com.cleverlance.java.course.hrsystem.model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/api/task")
    public ResponseEntity<List<Task>> getTasks() {
        Task task = new Task();
        task.setCompanyID(1);
        task.setNameCZ("úkol číslo 1");
        task.setNameEN("task number 1");
        return ResponseEntity.ok(List.of(task));
    }

    @PostMapping("/api/task")
    public ResponseEntity<Void> createTask(@RequestBody Task task) {
        LOGGER.debug("Task to store: {}", task);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/api/task/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable("id") Long id) {
        LOGGER.debug("Task to delete: {}", id);
        return ResponseEntity.noContent().build();
    }

}
