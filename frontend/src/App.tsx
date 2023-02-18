import React, {useEffect, useState} from 'react';
import logo from './logo.svg';
import './App.css';
import './ToDoCard.css'
import './ToDoBoard.css'
import Header from "./component/Header";
import {ToDo} from "./model/ToDo";
import axios from "axios";
import ToDoBoard from "./component/ToDoBoard";
import AddToDo from "./component/AddToDo";

function App() {

    const [todos, setToDos] = useState<ToDo[]>([{description: "test", id: "123", status: "OPEN"}]);
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

    function addToDo(newToDo: ToDo) {
        setToDos(prevState => [...prevState, newToDo])
    }


    useEffect(() =>{getToDos()}, [])

  return (
      <div className="App">

          <Header/>

          <div className={"ToDoBoards"}>
            <ToDoBoard todos={todos} title={"To Do"}/>
            <ToDoBoard todos={todos} title={"Doing"}/>
            <ToDoBoard todos={todos} title={"Done"}/>
          </div>

          <AddToDo onAddToDo={addToDo}/>



      </div>
  );
}

export default App;
