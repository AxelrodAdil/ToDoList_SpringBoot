package com.example.todo.repo;

import com.example.todo.Model.model_todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface toDoRepo extends JpaRepository<model_todo, Long> {

}