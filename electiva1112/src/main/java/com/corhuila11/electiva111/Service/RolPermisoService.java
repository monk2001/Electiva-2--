package com.corhuila11.electiva111.Service;


import com.corhuila11.electiva111.IRepository.IRolPermisoRepository;
import com.corhuila11.electiva111.IService.IRolPermisoService;
import com.corhuila11.electiva111.entity.Producto;
import com.corhuila11.electiva111.entity.RolPermiso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RolPermisoService implements IRolPermisoService {

    @Autowired
    private IRolPermisoRepository iRolPermisoRepository;

    @Override
    public List<RolPermiso> all() {
        return iRolPermisoRepository.findAll();
    }

    @Override
    public Optional<RolPermiso> findById(Long id) {
        return iRolPermisoRepository.findById(id);
    }

    @Override
    public RolPermiso save(RolPermiso rolPermiso) {
        return iRolPermisoRepository.save(rolPermiso);
    }

    @Override
    public void update(RolPermiso rolPermiso, Long id) {
        //validar si existe.

        Optional<RolPermiso> op = iRolPermisoRepository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            RolPermiso rolPermisoUpdate = op.get();
            rolPermisoUpdate.setPermisoId(rolPermiso.getPermisoId());
            rolPermisoUpdate.setRolId(rolPermiso.getRolId());



            //Actualizar el objeto
            iRolPermisoRepository.save(rolPermisoUpdate);
        }

    }

    @Override
    public void delete(Long id) {
        iRolPermisoRepository.deleteById(id);
    }
}
