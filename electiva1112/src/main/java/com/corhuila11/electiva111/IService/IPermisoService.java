package com.corhuila11.electiva111.IService;

import com.corhuila11.electiva111.entity.Permiso;

import java.util.List;
import java.util.Optional;

public interface IPermisoService {

    List<Permiso> all();

    public Optional<Permiso> findById(Long id);

    public Permiso save(Permiso permiso);

    public void update(Permiso permiso, Long id);

    public void delete(Long id);
}
