package com.corhuila11.electiva111.IService;

import com.corhuila11.electiva111.entity.RolPermiso;

import java.util.List;
import java.util.Optional;

public interface IRolPermisoService {

    List<RolPermiso> all();

    public Optional<RolPermiso> findById(Long id);

    public RolPermiso save(RolPermiso rolPermiso);

    public void update(RolPermiso rolPermiso, Long id);

    public void delete(Long id);
}
