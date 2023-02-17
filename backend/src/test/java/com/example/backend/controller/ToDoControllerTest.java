package com.example.backend.controller;

import com.example.backend.model.Status;
import com.example.backend.model.ToDo;
import com.example.backend.repository.ToDoRepository;
import com.example.backend.service.IdService;
import com.example.backend.service.ToDoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ToDoControllerTest {

    @Autowired
    MockMvc mockMvc;


    @Test
    void getToDoList() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/todo"))
                .andExpect(status().isOk())
                .andExpect(content().json("[]"));
    }

    @Test
    void editToDo() {
    }

    @Test
    void addToDo() {
    }

    @Test
    void changeStatus() {
    }

    @Test
    void deleteToDo() {
    }
}