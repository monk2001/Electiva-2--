import React, { useEffect, useState } from "react";
import './almacenInfo.css';
import { Link } from "react-router-dom";
import BarraSuperior from "../../layout/BarraSuperior";
import Almacenamiento from "./Almacenamiento";


const AlmacenamientoInformacionCliente = () => {
    

    const [users, setUsers]=useState([])
    const [search,setSearch]=useState("")

    //funcion para traer los datos de la API

const Url ='http://localhost:9090/v1/api/InformacionCliente'



    const showData = async ()=> {
        const  response = await fetch(Url)
        const data = await response.json()
        //console.log(data)
        setUsers(data)
        console.log(data)

    }

    //metodo de filtrado
    let results=[]
if(!search){
results=users
}else {
  results =  users.filter((dato)=>
    dato.titulo.toLowerCase().includes(search.toLocaleLowerCase())
)
}
    //funcion de busqueda
const searcher =(e)=>{
    setSearch(e.target.value)

}

useEffect( ()=>{
    showData()
}, [])



    //renderizamos la vista
    return(
        
        <div>
            <BarraSuperior/>
            <div className="fondo1">
           
            <input  value={search} onChange={searcher} type='text' placeholder='Buscar' className='form-control'/>
            <div className="container">
                {results.map((user) => (
                    <div className="card1" key={user.id}>
                        <div className="card-body1">
                            <h5 className="card-title">Nombre: {user.productoClienteId.personaId.primernombre} <br/> Asunto:{user.titulo}</h5>
                            <label className="switch">
                                <input type="checkbox" id={`toggleSwitch-${user.id}`} checked={user.estado} />
                                <span className="slider round"></span>
                            </label>
                            <p className="card-text">{user.tiposolicitud}
                            </p>

                        </div>
                    </div>
                ))}
            </div>

        </div>
        </div>

    
    )
};

export default AlmacenamientoInformacionCliente;