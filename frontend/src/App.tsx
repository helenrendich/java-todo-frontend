import React, {useEffect, useState} from 'react';
import logo from './logo.svg';
import './App.css';
import './ToDoCard.css'
import './ToDoBoard.css'
import Header from "./component/Header";
import {ToDo} from "./model/ToDo";
import axios from "axios";
import ToDoBoard from "./component/ToDoBoard";

function App() {

    const [todos, setToDos] = useState<ToDo[]>([{description: "test", id: "123", status: "open"}]);

    const[text, setText] =useState<string>("");

    function getToDos(){
        axios.get("/api/todo")
            .then((response)=> {
                setToDos(response.data);
            })
            .catch(error => {
                console.error(error);
            })
    }

    useEffect(() =>{getToDos()}, [])

  return (
      <div className="App">

            <Header/>

            <ToDoBoard todos={todos} title={"To Do"}/>


      </div>
  );
}

export default App;
