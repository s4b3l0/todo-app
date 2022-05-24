package com.todo.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.ZonedDateTime;

@Entity
@Table(name = "TODO_ITEM")
public class TodoItem implements Serializable {
    private Long id;
    private String description;
    private String title;
    private ZonedDateTime effFrom;
    private ZonedDateTime effTo;
    private boolean done;

    private TodoItem(Long id, String description, String title, ZonedDateTime effFrom, ZonedDateTime effTo, boolean done) {
        this.id = id;
        this.description = description;
        this.title = title;
        this.effFrom = effFrom;
        this.effTo = effTo;
        this.done = done;
    }

    public TodoItem() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "TITLE", length = 55)
    public String getTitle() {
        return title;
    }

    public void setTitle(String tittle) {
        this.title = tittle;
    }

    @Column(name = "EFF_FROM")
    public ZonedDateTime getEffFrom() {
        return effFrom;
    }

    public void setEffFrom(ZonedDateTime effFrom) {
        this.effFrom = effFrom;
    }

    @Column(name = "EFF_TO", length = 55)
    public ZonedDateTime getEffTo() {
        return effTo;
    }

    public void setEffTo(ZonedDateTime effTo) {
        this.effTo = effTo;
    }

    @Column(name = "DONE", length = 55)
    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public static class TodoItemBuilder {
        private Long id;
        private String description;
        private String title;
        private ZonedDateTime effFrom;
        private ZonedDateTime effTo;
        private boolean done;

        public void withId(Long id) {
            this.id = id;
        }

        public void withDescription(String description) {
            this.description = description;
        }

        public void withtitle(String title) {
            this.title = title;
        }

        public void withEffFrom(ZonedDateTime effFrom) {
            this.effFrom = effFrom;
        }

        public void withEffTo(ZonedDateTime effTo) {
            this.effTo = effTo;
        }

        public void withDone(boolean done) {
            this.done = done;
        }

        public TodoItem build() {
            return new TodoItem(id, description, title, effFrom, effTo, done);
        }
    }
}
