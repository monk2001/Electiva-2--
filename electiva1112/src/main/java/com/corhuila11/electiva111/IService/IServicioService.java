package com.corhuila11.electiva111.IService;

import com.corhuila11.electiva111.entity.Servicio;

import java.util.List;
import java.util.Optional;

public interface IServicioService {

    List<Servicio> all();

    public Optional<Servicio> findById(Long id);

    public Servicio save(Servicio servicio);

    public void update(Servicio servicio, Long id);

    public void delete(Long id);
}
