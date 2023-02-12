package com.example.backend.repository;

import com.example.backend.model.Status;
import com.example.backend.model.ToDo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.NotAcceptableStatusException;

import java.util.List;
import java.util.NoSuchElementException;

@Repository
@AllArgsConstructor
public class ToDoRepository {

    private final List<ToDo> toDoList;

    public List<ToDo> getToDoList() {
        return toDoList;
    }

    public ToDo addToDo(ToDo toDo){
        toDoList.add(toDo);
        return toDo;
    }

    public ToDo getToDo(String id){
        for(ToDo todo: toDoList){
            if(todo.id().equals(id)){
                return todo;
            }
        }
        throw new NoSuchElementException("id not found");
    }

    public ToDo deleteToDo(String id) {
        ToDo toDoToDelete = getToDo(id);
        toDoList.remove(getToDo(id));
        return toDoToDelete;
    }


}
