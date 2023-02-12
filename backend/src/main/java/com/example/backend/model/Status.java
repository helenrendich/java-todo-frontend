package com.example.backend.model;


import lombok.AllArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@ToString
public enum Status {

    OPEN("Open"),
    IN_PROGRESS("In progress"),
    DONE("Done");

    private final String status;

}
