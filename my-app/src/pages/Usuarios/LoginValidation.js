function Validation(values){
    let error = {}
    const email_pattern = /^[^\s@]+@[^\s@].[^\s@]+$/
    const password_pattern = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]{8,}$/

    if(values.email === ""){
        error.email = "El correo no debe estar vacio"
    }
    else if(!email_pattern.test(values.email)){
        error.email = "El correo electronico no coincide"
    }else{
        error.email =""
    }
    if(values.password === ""){
        error.password = "La contraseña no debe estar vacia"
    }
    else if(!password_pattern.test(values.password)){
        error.password = "La contraseña no coincide"
    }else{
        error.password =""
    }
    return error;
}

export default Validation