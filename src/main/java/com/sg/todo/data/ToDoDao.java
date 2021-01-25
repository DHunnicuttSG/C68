package com.sg.todo.data;

import com.sg.todo.models.ToDo;

import java.util.List;

public interface ToDoDao {

    ToDo add(ToDo todo);

    List<ToDo> getAll();

    ToDo findById(int id);

    boolean update(ToDo todo);

    boolean deleteById(int id);
}
