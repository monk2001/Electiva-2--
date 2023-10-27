import React from "react";
import './Empleado.css';
import { Link } from "react-router-dom";
import AlmacenamientoInformacionCliente from "./AlmacenamientoInformacionCliente";

const Almacenamiento = () => {
    return (
        <div className={"container"}>
          
            <div class= "body">
             <div class="card">
  <div class="card-body">
  <h1 class="texto">Categorias</h1>

  <Link to="/AlmacenamientoInformacionCliente" type="button " class="btn-mi-boton">Informacion de cliente</Link>
  <Link to= "/Opiniones" type="button" class="btn-mi-boton">Opiniones</Link>
  

  <h1 class="texto-opciones">Opciones para agregar datos</h1>
    <div class="dropdown">
          <button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
            Agregar
          </button>
          <ul class="dropdown-menu">
        <li><a class="dropdown-item" href="#">Informacion sobre el cliente</a></li>

    
  </ul>
</div>
  </div>
</div>  
        </div>
        </div>

    );
    
}; 

export default Almacenamiento;