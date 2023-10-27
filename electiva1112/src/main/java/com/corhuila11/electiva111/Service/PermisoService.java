package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.IPermisoRepository;
import com.corhuila11.electiva111.IService.IPermisoService;
import com.corhuila11.electiva111.entity.Permiso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PermisoService implements IPermisoService {

    @Autowired
    private IPermisoRepository iPermisoRepository;

    @Override
    public List<Permiso> all() {
        return iPermisoRepository.findAll();
    }

    @Override
    public Optional<Permiso> findById(Long id) {
        return iPermisoRepository.findById(id);
    }

    @Override
    public Permiso save(Permiso permiso) {
        return iPermisoRepository.save(permiso);
    }

    @Override
    public void update(Permiso permiso, Long id) {
        //validar si existe.

        Optional<Permiso> op = iPermisoRepository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Permiso permisoUpdate = op.get();
            permisoUpdate.setDescripcion(permiso.getDescripcion());
            permisoUpdate.setEstado(permiso.getEstado());



            //Actualizar el objeto
            iPermisoRepository.save(permisoUpdate);
        }

    }

    @Override
    public void delete(Long id) {
        iPermisoRepository.deleteById(id);
    }
}
