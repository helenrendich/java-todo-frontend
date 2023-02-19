import React from "react";
import {ToDo} from "../model/ToDo";
import ToDoCard from "./ToDoCard";

type ToDoBoardProps = {

    todos: ToDo[],
    title: string
}

export default function ToDoBoard(props: ToDoBoardProps){

    const boardStatus = props.title === "To Do"? "OPEN":
        props.title === "Doing"? "IN_PROGRESS":
            props.title === "Done"? "DONE": {throw: new Error('Exception')}

    const filteredCards = props.todos.filter(todo => {return todo.status === boardStatus})

    const toDoCards = filteredCards.map(todo =>
        <ToDoCard description={todo.description} id={todo.id} status={todo.status}/>);


    return(
        <div className= "ToDoBoard">
            <h1> {props.title} </h1>
            <div> {toDoCards}</div>
        </div>
    )

}
