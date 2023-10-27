package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.ICiudadRepository;
import com.corhuila11.electiva111.IService.ICiudadService;
import com.corhuila11.electiva111.entity.Ciudad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class CiudadService implements ICiudadService {

    @Autowired
    private ICiudadRepository iCiudadRepository;

    @Override
    public List<Ciudad> all() {
        return iCiudadRepository.findAll();
    }

    @Override
    public Optional<Ciudad> findById(Long id) {
        return iCiudadRepository.findById(id);
    }

    @Override
    public Ciudad save(Ciudad ciudad) {
        return iCiudadRepository.save(ciudad);
    }

    @Override
    public void update(Ciudad ciudad, Long id) {
        //validar si existe.

        Optional<Ciudad> op = iCiudadRepository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Ciudad ciudadUpdate = op.get();
            ciudadUpdate.setNombre(ciudad.getNombre());
            ciudadUpdate.setDepartamentoId(ciudad.getDepartamentoId());





            //Actualizar el objeto
            iCiudadRepository.save(ciudadUpdate);
        }

    }

    @Override
    public void delete(Long id) {
        iCiudadRepository.deleteById(id);
    }


}

