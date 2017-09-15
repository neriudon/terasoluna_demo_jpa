package terasoluna_demo_jpa.domain.service;

import java.util.Collection;

import terasoluna_demo_jpa.domain.model.Todo;

public interface TodoService {
	Collection<Todo> findAll();

	Todo create(Todo todo);

	Todo finish(String todoId);

	void delete(String todoId);
}