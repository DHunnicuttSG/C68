package com.sg.todo.controller;

import com.sg.todo.data.ToDoDao;
import com.sg.todo.models.ToDo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ToDoController {

    private final ToDoDao dao;

    public ToDoController(ToDoDao dao) {
        this.dao = dao;
    }

    @GetMapping("/todos")
    public List<ToDo> all() {
        return dao.getAll();
    }
}
