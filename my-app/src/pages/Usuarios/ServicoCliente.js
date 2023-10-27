import React from "react";
import './usuario.css';
import { Link } from "react-router-dom";
import BarraSuperiorClientes from "../../layout/BarraSuperiorClientes";
import logo_scotialbank from "../../imagenes/Logo_Scotiabank.png";





const ServicioCliente = () => {
    

    return(
        <div>
            <BarraSuperiorClientes/>
        <div className="fondo1">

        
        <div className="d-flex justify-content-center align-items-center fondo vh-100">
  <div className="fondo-tarjeta p-3 rounded w-25" >
    
        <div><img 
                  src={logo_scotialbank} float="right" margin-right="100px" width="150" height="150" class="img-size" alt="" />
            <h2>Sercicio al cliente </h2>
      
      <p></p>

      <table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Ciudad</th>
      <th scope="col">Numero de Telefono</th>
      
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Neiva</td>
      <td>6088631616</td>
     
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Bogotá</td>
      
      <td>6017561616</td>
      
      
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>Cali</td>
      <td>6024891616</td>
      
      
      
      
    </tr>
  </tbody>
</table>
      

      </div>
    
  </div>
</div>
</div>
</div>

        
    );
};

export default ServicioCliente;