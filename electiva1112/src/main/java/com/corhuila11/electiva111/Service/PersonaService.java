package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.IPersonaRepository;
import com.corhuila11.electiva111.IService.IPersonaService;
import com.corhuila11.electiva111.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersonaRepository iPersonaRepository;

    @Override
    public List<Persona> all() {
        return iPersonaRepository.findAll();
    }

    @Override
    public Optional<Persona> findById(Long id) {
        return iPersonaRepository.findById(id);
    }

    @Override
    public Persona save(Persona persona) {
        return iPersonaRepository.save(persona);
    }

    @Override
    public void update(Persona persona, Long id) {
        //validar si existe.

        Optional<Persona> op = iPersonaRepository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Persona personaUpdate = op.get();
            personaUpdate.setDireccion(persona.getDireccion());
            personaUpdate.setCiudadId(persona.getCiudadId());
            personaUpdate.setIdentificacion(persona.getIdentificacion());
            personaUpdate.setGenero(persona.getGenero());
            personaUpdate.setPrimernombre(persona.getPrimernombre());
            personaUpdate.setPrimerapellido(persona.getPrimerapellido());
            personaUpdate.setSegundonombre(persona.getSegundonombre());
            personaUpdate.setSegundoapellido(persona.getSegundoapellido());
            personaUpdate.setCorreo_electronico(persona.getCorreo_electronico());
            personaUpdate.setTipo_documento(persona.getTipo_documento());


            //Actualizar el objeto
            iPersonaRepository.save(personaUpdate);
        }

    }

    @Override
    public void delete(Long id) {
        iPersonaRepository.deleteById(id);
    }
}
