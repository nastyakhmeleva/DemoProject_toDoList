package com.example.todolist.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todolist.models.Task;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final static List<Task> tasks = new ArrayList<>();

    @PostMapping("")
    public Task addTask(@RequestBody Task task) {
        tasks.add(task);
        return task;
    }

    @GetMapping("")
    public List<Task> getTasks() {
        return tasks;
    }
}
