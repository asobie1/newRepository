package com.arek.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arek.todo.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{

}
