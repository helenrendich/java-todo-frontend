package com.example.backend.controller;

import com.example.backend.model.ToDo;
import com.example.backend.service.ToDoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("api")
public class ToDoController {

    private final ToDoService toDoService;


    @GetMapping("/todo")
    public List<ToDo> getToDoList(){
        return toDoService.getToDoList();
    }

    @GetMapping("/todo/{id}")
    public ToDo editToDo(@PathVariable String id){
        return toDoService.getToDo(id);
    }

    @PostMapping("/todo")
    public ToDo addToDo(@RequestBody ToDo toDoToAdd){
        return toDoService.addToDo(toDoToAdd);
    }

    @PutMapping("/todo/{id}")
    public ToDo changeStatus(@RequestBody ToDo toDo, @PathVariable String id){
        toDoService.deleteToDo(id);
        toDoService.addToDo(toDo);
        return toDo;
    }

    @DeleteMapping("/todo/{id}")
    public void deleteToDo(@PathVariable String id){
        toDoService.deleteToDo(id);
    }

}
