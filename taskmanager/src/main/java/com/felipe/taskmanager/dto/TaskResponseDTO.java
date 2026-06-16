package com.felipe.taskmanager.dto;

public class TaskResponseDTO {

    private Long id;
    private String title;
    private String description;
    private Boolean completed;

    public TaskResponseDTO(Long id, String title, String description, Boolean completed) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    public Long getId() { return id; }
    public String getTtitle() { return title; }
    public String getDescription() { return description; }
    public Boolean getCompleted() { return completed; }
}
