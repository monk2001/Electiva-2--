package com.corhuila11.electiva111.IService;

import com.corhuila11.electiva111.entity.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {

    List<Persona> all();

    public Optional<Persona> findById(Long id);

    public Persona save(Persona persona);

    public void update(Persona persona, Long id);

    public void delete(Long id);
}
