package com.todo.app.service.impl.com.todo.app.service;

import com.todo.app.entity.TodoItem;
import com.todo.app.repository.TodoItemRepository;
import com.todo.app.service.impl.GenericService;
import org.springframework.stereotype.Service;

@Service
public class TodoItemService extends GenericService<TodoItemRepository, TodoItem> {
    public TodoItemService(TodoItemRepository repository) {
        super(repository);
    }
}
