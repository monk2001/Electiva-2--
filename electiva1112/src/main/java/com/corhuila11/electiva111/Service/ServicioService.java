package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.IServicioRepository;
import com.corhuila11.electiva111.IService.IServicioService;
import com.corhuila11.electiva111.entity.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioService implements IServicioService {

    @Autowired
    private IServicioRepository iServicioRepository;

    @Override
    public List<Servicio> all() {
        return iServicioRepository.findAll();
    }

    @Override
    public Optional<Servicio> findById(Long id) {
        return iServicioRepository.findById(id);
    }

    @Override
    public Servicio save(Servicio servicio) {
        return iServicioRepository.save(servicio);
    }

    @Override
    public void update(Servicio servicio, Long id) {
        //validar si existe.

        Optional<Servicio> op = iServicioRepository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Servicio servicioUpdate = op.get();
            servicioUpdate.setDescripcion(servicio.getDescripcion());




            //Actualizar el objeto
            iServicioRepository.save(servicioUpdate);
        }

    }

    @Override
    public void delete(Long id) {
        iServicioRepository.deleteById(id);
    }
}
