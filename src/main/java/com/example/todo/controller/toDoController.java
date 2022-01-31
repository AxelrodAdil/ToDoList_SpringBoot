package com.example.todo.controller;

import com.example.todo.Model.model_todo;
import com.example.todo.repo.toDoRepo;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class toDoController {

    @Autowired
    private toDoRepo toDoRepo;

    @GetMapping
    public List<model_todo> findAll(){
        return toDoRepo.findAll();
    }

    @PostMapping
    public model_todo save(@Valid @NotNull @RequestBody model_todo model_todo){
        return toDoRepo.save(model_todo);
    }

    @PutMapping
    public model_todo update(@Valid @NotNull @RequestBody model_todo model_todo){
        return toDoRepo.save(model_todo);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        toDoRepo.deleteById(id);
    }
}