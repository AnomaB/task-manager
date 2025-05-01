package com.example.taskbackend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskbackend.model.Task;
import com.example.taskbackend.repository.ClassRepository;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins="http://localhost:3000")
public class TaskController 
{
	private final ClassRepository repo;
	
	public TaskController(ClassRepository repo)
	{
		this.repo=repo;
	}
	
	@GetMapping
	public List<Task> getAllTasks()
	{
		return repo.findAll();
	}
	
	@PostMapping
	public Task addTask(@RequestBody Task task)
	{
		return repo.save(task);
	}
	
	@DeleteMapping
	public void deleteTask(@PathVariable int id)
	{
		repo.deleteById(id);
	}
}
