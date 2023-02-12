package com.example.backend.service;

import com.example.backend.model.Status;
import com.example.backend.model.ToDo;
import com.example.backend.repository.ToDoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ToDoService {

    private final ToDoRepository toDoRepository;
    private final IdService idService;


    public List<ToDo> getToDoList() {return toDoRepository.getToDoList();}

    public ToDo addToDo(ToDo todo) {
        ToDo toDoToAdd = todo;
        if(todo.status().equals(Status.OPEN)){
        toDoToAdd = new ToDo(todo.description(), idService.generateId(), todo.status());}
        return toDoRepository.addToDo(toDoToAdd);
    }

    public ToDo getToDo(String id){
        return toDoRepository.getToDo(id);
    }

    public ToDo deleteToDo(String id){
        return toDoRepository.deleteToDo(id);
    }

}
