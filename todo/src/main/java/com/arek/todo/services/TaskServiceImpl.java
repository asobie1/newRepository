package com.arek.todo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.arek.todo.entity.Task;
import com.arek.todo.repository.TaskRepository;

public class TaskServiceImpl implements TaskService{

	private TaskRepository taskRepository;
	
	@Autowired
	public TaskServiceImpl(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	@Override
	public List<Task> findAll() {
		return taskRepository.findAll();
	}

	@Override
	public Task findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Task theTask) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}

}
