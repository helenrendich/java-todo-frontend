import React from "react";
import {ToDo} from "../model/ToDo";


export default function ToDoCard(props: ToDo){
    function Advance() {

    }

    return (
        <div className="ToDoCard">
            <h3> {props.description} </h3>
            <div className="Buttons">
                <button > Details </button>
                <button> Edit </button>
                <button onClick={Advance}
                    > {props.status === "DONE"? 'Delete' : 'Advance' } </button>
            </div>
        </div>
    )
}