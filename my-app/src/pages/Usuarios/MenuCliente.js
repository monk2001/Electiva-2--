import React from "react";
import './usuario.css';
import { Link } from "react-router-dom";
import BarraSuperiorClientes from "../../layout/BarraSuperiorClientes";
import logo_scotialbank from "../../imagenes/Logo_Scotiabank.png";
import ServicioCliente from "./ServicoCliente";





const MenuCliente = () => {
    

    return(
        <div>
            <BarraSuperiorClientes/>
        <div className="fondo1">

        
        <div className="d-flex justify-content-center align-items-center fondo vh-100">
  <div className="fondo-tarjeta p-3 rounded w-25" >
    
        <div><img 
                  src={logo_scotialbank} float="right" margin-right="100px" width="150" height="150" class="img-size" alt="" />
            <h2>Menu del Cliente</h2>
      
      <Link to="/ServicioCliente" type="submit" className="btn-ingreso  btn-success w-80">Servicio al Cliente</Link>
      <p></p>

      </div>
    
  </div>
</div>
</div>
</div>
        
    )
};

export default MenuCliente;