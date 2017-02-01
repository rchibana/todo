package br.com.todo.entity.task;

import org.springframework.data.annotation.Id;

/**
 * Created by rchibana on 1/29/17.
 */
public class Task {

    @Id
    public Long id;
    public String name;
    public String description;

    public Task(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
