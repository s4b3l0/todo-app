package com.todo.app.rest.impl;

import com.todo.app.service.impl.GenericService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class GenericController<T extends GenericService, S> {
    final T service;

    public GenericController(T service) {
        this.service = service;
    }

    @PostMapping("/save")
    public ResponseEntity<Object> saveTodo(@RequestBody S item) {
        return ResponseEntity.ok(service.create(item));
    }

    @GetMapping("/{itemsPerPage}/{pageNo}")
    public ResponseEntity<Page<S>> getTodos(@PathVariable() int itemsPerPage, @PathVariable() int pageNo) {
        return ResponseEntity.ok(service.getByPage(pageNo, itemsPerPage));
    }

}
