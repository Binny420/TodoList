package com.jsp.springboot.webApplication.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();

	private static int todoCount = 0;
//	static {
//		todos.add(new Todo(++todoCount, "Binish", "Learn AWS", LocalDate.now().plusYears(1), false));
//
//		todos.add(new Todo(++todoCount, "Binish", "Learn react", LocalDate.now().plusYears(1), false));
//
//		todos.add(new Todo(++todoCount, "Binish", "Learn Spring", LocalDate.now().plusYears(1), false));
//	}

	public List<Todo> findByUserName(String username) {
		Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);
		return todos.stream().filter(predicate).toList();
	}

	public void addNewTodo(String username, String description, LocalDate localDate, boolean done) {
		Todo todo = new Todo(++todoCount, username, description, localDate, done);
		todos.add(todo);
	}

	public void deleteTodos(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}

	public Todo findById(int id) {
		Predicate<Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;

	}

	public void updateTodo(@Valid Todo todo) {
		deleteTodos(todo.getId());
		todos.add(todo);

	}
}
