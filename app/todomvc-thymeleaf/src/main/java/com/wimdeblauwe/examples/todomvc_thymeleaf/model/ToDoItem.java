package com.example.todomvc.model;

import jakarta.persistence.*;

@Entity
public class TodoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private boolean completed;

    public TodoItem() {}

    public TodoItem(String title) {
        this.title = title;
        this.completed = false;
    }

    // Getters and Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}

import jakarta.validation.constraints.NotBlank;

public class TodoItem {
    // Other 
    @NotBlank(message = "Title must not be empty")
    private String title;
}