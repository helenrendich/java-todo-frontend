import React, {ChangeEvent, useState} from "react";
import {ToDo} from "../model/ToDo";

type Props = {
    onAddToDo: (newToDo: ToDo) => void
}

export default function AddToDo(props: Props) {

    const [description, setDescription] = useState<string>("")


    function onDescriptionChange(event: ChangeEvent<HTMLInputElement>) {
        setDescription(event.target.value)
    }

    function onToDoSave() {
        props.onAddToDo({id: "123", description, status: "OPEN"})
    }

    return <div className="Add-Todo">
        <label>New To Do: </label>
        <input value={description} onChange={onDescriptionChange} />
        <button onClick={onToDoSave}>Add</button>
    </div>
}