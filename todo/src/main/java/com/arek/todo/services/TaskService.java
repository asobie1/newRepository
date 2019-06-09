package com.arek.todo.services;

import java.util.List;

import com.arek.todo.entity.Task;

public interface TaskService {

public List<Task> findAll();
	
	public Task findById(int theId);
	
	public void save(Task theTask);
	
	public void deleteById(int theId);
	
}
