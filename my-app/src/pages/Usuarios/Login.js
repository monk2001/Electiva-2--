import React, { useState } from "react";
import './usuario.css';
import logo_scotialbank from "../../imagenes/Logo_Scotiabank.png";
import { Link, useNavigate } from "react-router-dom";
import axios from 'axios';
import Validation from "./LoginValidation";
import AlmacenamientoInformacionCliente from "../Empleados/AlmacenamientoInformacionCliente";




function Login() {

    const [values,setValues] = useState ({
        email: '',
        password: ''
    })
    const navigate = useNavigate();
    const[error, setErrors]=useState({})
    const handleImput = (event) =>{
        setValues(prev => ({...prev,[event.target.name]: event.target.value}))
    }

    const handleSubmit = (event) => {
        event.preventDefault();
        setErrors(Validation(values));
      
        // Check for errors using the 'error' state
        if (error.name === "" && error.email === "" && error.password === "") {
          axios.post('http://localhost:8080/user', values)
            .then(res => {
              if (res.data.success) {
                // Check user role and redirect accordingly
                if (res.data.user.role === 'cliente') {
                  navigate('/cliente'); // Redirect to cliente route
                } else if (res.data.user.role === 'empleado') {
                  navigate('/empleado'); // Redirect to empleado route
                } else {
                  alert('Invalid role');
                }
              } else {
                alert("No existe cuenta");
              }
            })
            .catch(err => console.log(err));
        }
      };


    return(
        <div className="d-flex justify-content-center align-items-center fondo vh-100">
  <div className="fondo-tarjeta p-3 rounded w-25" >
    <form action="" onSubmit={handleSubmit}>
        <div><img 
                  src={logo_scotialbank} float="right" margin-right="100px" width="150" height="150" class="img-size" alt="" />
            <h2>Iniciar Sesión</h2>
      <div className="mb-3">
        <label htmlFor="email"><strong>Correo</strong> </label>
        <input type="email" placeholder="Ingrese correo" name="email" onChange={handleImput} class="form-control rounded-pill"  />
       {error.email && <span className="text-danger">{error.email}</span>} 
      </div>
      <div className="mb-3">
        <label htmlFor="password"><strong>Contraseña</strong></label>
        <input type="password" class="form-control rounded-pill" placeholder="Ingrese contraseña" name="password" onChange={handleImput}  />
        {error.password && <span className="text-danger">{error.password}</span>} 

      </div>

      <Link to="/AlmacenamientoInformacionCliente" type="submit" className="btn-ingreso  btn-success w-80">Ingresar</Link>
      <p></p>
      <Link to="/CrearCuenta" className="btn-crear btn-default border " >Crear Cuenta</Link>
      </div>
    </form>
  </div>
</div>
    )
    
}

export default Login