package com.todo.app.rest.impl.com.todo.app.rest;

import com.todo.app.entity.TodoItem;
import com.todo.app.rest.impl.GenericController;
import com.todo.app.service.impl.com.todo.app.service.TodoItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/todo")
public class TodoItemController extends GenericController<TodoItemService, TodoItem> {
    public TodoItemController(TodoItemService service) {
        super(service);
    }
}
