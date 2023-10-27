package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.IPaisRepository;
import com.corhuila11.electiva111.IService.IPaisService;
import com.corhuila11.electiva111.entity.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisService implements IPaisService {

    @Autowired
    private IPaisRepository iPaisRepository;

    @Override
    public List<Pais> all() {
        return iPaisRepository.findAll();
    }

    @Override
    public Optional<Pais> findById(Long id) {
        return iPaisRepository.findById(id);
    }

    @Override
    public Pais save(Pais pais) {
        return iPaisRepository.save(pais);
    }

    @Override
    public void update(Pais pais, Long id) {
        //validar si existe.

        Optional<Pais> op = iPaisRepository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Pais paisUpdate = op.get();
            paisUpdate.setNombre(pais.getNombre());



            //Actualizar el objeto
            iPaisRepository.save(paisUpdate);
        }

    }

    @Override
    public void delete(Long id) {
        iPaisRepository.deleteById(id);
    }
}
