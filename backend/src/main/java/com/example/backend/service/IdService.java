package com.example.backend.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class IdService {

    public static String generateId(){
        String id= UUID.randomUUID().toString();
        return id;
    }
}
