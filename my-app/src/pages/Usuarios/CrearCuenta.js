import React,{useState} from "react";
import './usuario.css';
import logo_scotialbank from "../../imagenes/Logo_Scotiabank.png";
import { Link, useNavigate } from "react-router-dom";
import Validation from "./LoginValidation";
import axios from 'axios';


function CrearCuenta() {
    const [persona, setPersona] = useState({
        personaId:'',
        primernombre: '',
        segundonombre: '',
        primerapellido: '',
        segundoapellido: '',
        tipo_documento: '',
        identificacion: ''
    });

    const [rol, setRol] = useState({
        rolId:'',
        nombre:''
    });

    const [values, setValues] = useState({
        primernombre: '',
        segundonombre: '',
        primerapellido: '',
        segundoapellido: '',
        tipo_documento: '',
        identificacion: '',
        correo_electronico: '',
        contrasena: '',
      });
    
      const navigate = useNavigate();
      const [error, setErrors] = useState({});
    
      const handleInput = (event) => {
        setValues((prev) => ({ ...prev, [event.target.name]: event.target.value }));
      };
    
      const handleSubmit = (event) => {
        event.preventDefault();
        setErrors(Validation(values));
    
        // Check for errors
        if (error.primernombre === "" && error.primerapellido === "" && error.tipo_documento === "" && error.identificacion === "" && error.correo_electronico === "" && error.contrasena === "") {
          // Create the user object with the 'cliente' role
          const Persona = {
            primernombre: values.primernombre,
            segundonombre: values.segundonombre || '', // Add segundonombre if present
            primerapellido: values.primerapellido,
            segundoapellido: values.segundoapellido || '', // Add segundoapellido if present
            tipo_documento: values.tipo_documento,
            identificacion: values.identificacion,
            correo_electronico: values.correo_electronico,
            contrasena: values.contrasena,
            role: 'cliente', // Assign the 'cliente' role,
            
            
          };
    
          axios.post('http://localhost:8080/Persona', Persona)
            .then((res) => {
              navigate('/');
            })
            .catch((err) => console.log(err));
        }
      };
    
      return (
        <div className="d-flex justify-content-center align-items-center fondo vh-400">
          <div className="fondo-tarjeta p-3 rounded w-25">
            <form action="">
              <div>
                <img src={logo_scotialbank} float="right" margin-right="100px" width="150" height="150" class="img-size" alt="" />
                <h2>Crear Cuenta</h2>
                <div className="mb-3">
                  <label htmlFor="primernombre"><strong>Primer Nombre</strong></label>
                  <input type="primernombre" class="form-control rounded-pill" placeholder="Ingrese Primer Nombre" />
                </div>
                <div className="mb-3">
                  <label htmlFor="pegundonombre"><strong>Segundo Nombre</strong></label>
                  <input type="segundonombre" class="form-control rounded-pill" placeholder="Ingrese Segundo Nombre" />
                </div>
                <div className="mb-3">
                  <label htmlFor="primerapellido"><strong>Primer Apellido</strong></label>
                  <input type="primer apellido" class="form-control rounded-pill" placeholder="Primer Apellido" />
                </div>
                <div className="mb-3">
                  <label htmlFor="segundoapellido"><strong>Segundo Apellido</strong></label>
                  <input type="segundoapellido" class="form-control rounded-pill" placeholder="Ingrese Segundo Apellido" />
                </div>
                <div className="mb-3">
                  <label htmlFor="nombre"><strong>Nombre Usuario</strong></label>
                  <input type="nombre" class="form-control rounded-pill" placeholder="Ingrese Nombre Usuario" />
                </div>
                <div className="mb-3">
                  <label htmlFor="tipo_documento"><strong>Tipo Documento</strong></label>
                  <input type="tipo_documento" class="form-control rounded-pill" placeholder="Ingrese Tipo Documento" />
                </div>
                <div className="mb-3">
                  <label htmlFor="identificacion"><strong>Identificacion</strong></label>
                  <input type="identificacion" class="form-control rounded-pill" placeholder="Ingrese Identificacion" />
                </div>
                <div className="mb-3">
                  <label htmlFor="correo_electronico"><strong>Correo</strong></label>
                  <input type="correo_electronico" class="form-control rounded-pill" placeholder="Ingrese correo" />
                </div>
                <div className="mb-3">
                  <label htmlFor="contrasena"><strong>Contraseña</strong></label>
                  <input type="contrasena" class="form-control rounded-pill" placeholder="Ingrese contraseña" />
                </div>
    
                <button className="btn-ingreso  btn-success w-80">Crear Cuenta</button>
                <p></p>
                <Link to="/" className="btn-crear btn-default border">Iniciar Sesión</Link>
              </div>
            </form>
          </div>
        </div>
      );
    
}

export default CrearCuenta