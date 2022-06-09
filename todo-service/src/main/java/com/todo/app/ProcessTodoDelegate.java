package com.todo.app;

import com.todo.app.entity.TodoItem;
import lombok.experimental.Delegate;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service
public class ProcessTodoDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        TodoItem todoItem = new TodoItem();
        todoItem.setTitle("Hello");
        execution.setVariable("name", false);
        execution.setVariable("todo", todoItem);
    }
}
