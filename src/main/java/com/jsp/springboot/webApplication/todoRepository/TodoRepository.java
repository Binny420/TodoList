package com.jsp.springboot.webApplication.todoRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springboot.webApplication.todo.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

	public List<Todo> findByUsername(String username);
}
