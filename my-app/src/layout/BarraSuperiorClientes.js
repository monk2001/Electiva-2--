import React, { useState } from "react";
import logo_scotialbank from "../imagenes/Logo_Scotiabank.png";
import './Barra.css';
import { Link } from "react-router-dom";
import Login from "../pages/Usuarios/Login";

const BarraSuperiorClientes = () => {

  const [isOpen, setIsOpen] = useState(false);

  const handleClick = () => {
    setIsOpen(!isOpen);
  };

  const handleOptionClick = (e) => {
    // Carga la página correspondiente
    window.location.href = e.target.href;
  };

    return (
        <div>

        <nav class="navbar navbar-light  ColorBarraSuperior ">
          <a class="navbar-brand" href="#">
          <img 
                  src={logo_scotialbank} float="right" margin-right="100px" width="150" height="150" class="img-size" alt="" /> 
            
          </a>
          <h1 class="text-center">almacenamiento</h1>
          
          <div>
      <button
        className="btn btn-secondary dropdown-toggle"
        type="button"
        data-bs-toggle="dropdown"
        aria-expanded={isOpen}
        onClick={handleClick}
      >
        Opciones
      </button>
      <ul
        className="dropdown-menu"
        aria-labelledby="dropdownMenuButton"
        style={{ display: isOpen ? "block" : "none" }}
      >
        
        <li><a className="dropdown-item" href="/">Salir</a></li>
      </ul>
    </div>
    



        </nav>

          



  
        </div>
    );
}

export default BarraSuperiorClientes;
    