package com.corhuila11.electiva111.Service;


import com.corhuila11.electiva111.IRepository.IUsuarioRolRepository;

import com.corhuila11.electiva111.IService.IUsuarioRolService;
import com.corhuila11.electiva111.entity.UsuarioRol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioRolService implements IUsuarioRolService {
    @Autowired
    private IUsuarioRolRepository iUsuarioRolRepository;

    @Override
    public List<UsuarioRol> all() {
        return iUsuarioRolRepository.findAll();
    }

    @Override
    public Optional<UsuarioRol> findById(Long id) {
        return iUsuarioRolRepository.findById(id);
    }

    @Override
    public UsuarioRol save(UsuarioRol usuarioRol) {
        return iUsuarioRolRepository.save(usuarioRol);
    }

    @Override
    public void update(UsuarioRol usuarioRol, Long id) {
        //validar si existe.

        Optional<UsuarioRol> op = iUsuarioRolRepository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            UsuarioRol usuarioRolUpdate = op.get();
            usuarioRolUpdate.setUsuarioId(usuarioRol.getUsuarioId());
            usuarioRolUpdate.setRolId(usuarioRol.getRolId());



            //Actualizar el objeto
            iUsuarioRolRepository.save(usuarioRolUpdate);
        }

    }

    @Override
    public void delete(Long id) {
        iUsuarioRolRepository.deleteById(id);
    }


}
