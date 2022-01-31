package com.example.todo.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity//(name = "toDoList")
public class model_todo {

    private Long id;
    @NotBlank
    private String title;
    private String date;
    private String priority;
    private String description;

    /*@Id
    @SequenceGenerator(
            name = "toDoList_sequence",
            sequenceName = "toDoList_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "toDoList_sequence"
    )

    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "title",
            columnDefinition = "TEXT"
    )
    private String title;

    @Column(
            name = "date",
            columnDefinition = "TEXT"
    )
    private String date;

    @Column(
            name = "priority",
            columnDefinition = "TEXT"
    )
    private String priority;

    @Column(
            name = "description",
            columnDefinition = "TEXT"
    )
    private String description;*/

    public model_todo(Long id, String title, String date, String priority, String description){
        this.id = id;
        this.title = title;
        this.date = date;
        this.priority = priority;
        this.description = description;
    }

    /*public model_todo(Long id, String title){
        this.id = id;
        this.title = title;
    }*/

    public model_todo() {

    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}