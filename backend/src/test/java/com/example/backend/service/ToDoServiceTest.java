package com.example.backend.service;

import com.example.backend.model.Status;
import com.example.backend.model.ToDo;
import com.example.backend.repository.ToDoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ToDoServiceTest {

    ToDoRepository toDoRepository = mock(ToDoRepository.class);
    IdService idService = new IdService();
    ToDoService toDoService = new ToDoService(toDoRepository, idService);

    @Test
    void getToDoList() {
        //GIVEN
        when(toDoRepository.getToDoList())
                .thenReturn(List.of(new ToDo("test", "123", Status.OPEN)));
        //WHEN
        List<ToDo> actual = toDoService.getToDoList();

        //THEN
        verify(toDoRepository).getToDoList();
        Assertions.assertEquals(List.of(new ToDo("test", "123", Status.OPEN)), actual);

    }


    @Test
    void addToDo() {
    }

    @Test
    void getToDo() {
    }

    @Test
    void deleteToDo() {
    }
}