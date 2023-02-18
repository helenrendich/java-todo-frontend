import React from "react";
import {ToDo} from "../model/ToDo";
import ToDoCard from "./ToDoCard";

type ToDoBoardProps = {

    todos: ToDo[],
    title: string
}

export default function ToDoBoard(props: ToDoBoardProps){

    const toDoCards = props.todos.map(todo =>
        <ToDoCard description={todo.description} id={todo.id} status={todo.status}/>);


    return(
        <div className= "ToDoBoard">
            <h1> {props.title} </h1>
            <div> {toDoCards}</div>
        </div>
    )

}
