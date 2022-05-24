package com.todo.app.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public class GenericService<T extends JpaRepository, S> {
    final private T repository;

    public GenericService(T repository) {
        this.repository = repository;
    }

    public Object create(S item) {
        return repository.save(item);
    }

    public Page<S> getByPage(int pageNo, int itemsPerPage) {
        return repository.findAll(PageRequest.of(pageNo, itemsPerPage));
    }

}
