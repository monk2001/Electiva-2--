package com.corhuila11.electiva111.IService;

import com.corhuila11.electiva111.entity.Rol;

import java.util.List;
import java.util.Optional;

public interface IRolService {

    List<Rol> all();

    public Optional<Rol> findById(Long id);

    public Rol save(Rol rol);

    public void update(Rol rol, Long id);

    public void delete(Long id);
}
