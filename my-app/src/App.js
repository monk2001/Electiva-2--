import React from "react";

import BarraSuperior from "./layout/BarraSuperior";
import Almacenamiento from "./pages/Empleados/Almacenamiento";

import Login from "./pages/Usuarios/Login";
import {BrowserRouter as Router,Route,Routes, BrowserRouter} from "react-router-dom";
import CrearCuenta from "./pages/Usuarios/CrearCuenta";
import AlmacenamientoInformacionCliente from "./pages/Empleados/AlmacenamientoInformacionCliente";
import MenuCliente from "./pages/Usuarios/MenuCliente";
import ServicioCliente from "./pages/Usuarios/ServicoCliente";


function App() {
  return (
    
    <BrowserRouter>
      <Routes>
          <Route path="/" element={<Login/>}></Route>
          <Route path="/CrearCuenta" element={<CrearCuenta/>}></Route>
          <Route path="/AlmacenamientoInformacionCliente" element={<AlmacenamientoInformacionCliente/>}></Route>
          <Route path="/MenuCliente" element={<MenuCliente/>}></Route>
          <Route path="/ServicioCliente" element={<ServicioCliente/>}></Route>
         
        
      </Routes>
      </BrowserRouter>
       );
      
      
      

    /* <CrearCuenta/>
     <Router>
      <BarraSuperior/>
      <Almacenamiento/>
      <Routes>
          <Route exact path={"/agregarinformacioncliente"} element={<AgregarInformacionCliente/>}/>


      </Routes>
      



    </Router>
  
  
  
  
  <BrowserRouter>
      <Routes>
          <Route path="/" element={<Login/>}></Route>
          <Route path="/CrearCuenta" element={<CrearCuenta/>}></Route>
        

      </Routes>
      </BrowserRouter>
       );
        */
      
      

    

    
  
 
  
  
}

export default App;


