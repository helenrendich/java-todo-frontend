import React from "react";
import {ToDo} from "../model/ToDo";


export default function BlogCard(props: ToDo){
    return (
        <div className="ToDoCard">
            <h3> {props.description} </h3>
        </div>
    )
}