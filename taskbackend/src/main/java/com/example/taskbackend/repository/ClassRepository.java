package com.example.taskbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taskbackend.model.Task;

public interface ClassRepository extends JpaRepository<Task, Integer>
{

}
