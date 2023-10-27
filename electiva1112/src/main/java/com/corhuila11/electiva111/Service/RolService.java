package com.corhuila11.electiva111.Service;


import com.corhuila11.electiva111.IRepository.IRolRepository;
import com.corhuila11.electiva111.IService.IRolService;

import com.corhuila11.electiva111.entity.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class RolService implements IRolService {

    @Autowired
    private IRolRepository iRolRepository;

    @Override
    public List<Rol> all() {
        return iRolRepository.findAll();
    }

    @Override
    public Optional<Rol> findById(Long id) {
        return iRolRepository.findById(id);
    }

    @Override
    public Rol save(Rol rol) {
        return iRolRepository.save(rol);
    }

    @Override
    public void update(Rol rol, Long id) {
        //validar si existe.

        Optional<Rol> op = iRolRepository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Rol rolUpdate = op.get();
            rolUpdate.setNombre(rol.getNombre());




            //Actualizar el objeto
            iRolRepository.save(rolUpdate);
        }

    }

    @Override
    public void delete(Long id) {
        iRolRepository.deleteById(id);
    }
}
