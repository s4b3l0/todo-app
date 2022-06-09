package com.todo.app.rest.impl.com.todo.app.rest;

import com.todo.app.ProcessTodoDelegate;
import com.todo.app.entity.TodoItem;
import com.todo.app.rest.impl.GenericController;
import com.todo.app.service.impl.com.todo.app.service.TodoItemService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/todo")
public class TodoItemController extends GenericController<TodoItemService, TodoItem> {
    private TodoItemService service;
    private RuntimeService runtimeService;

    public TodoItemController(TodoItemService service, RuntimeService runtimeService) {
        super(service);
        this.service = service;
        this.runtimeService = runtimeService;
    }

}
