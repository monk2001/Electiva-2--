package com.corhuila11.electiva111.IService;

import com.corhuila11.electiva111.entity.Ciudad;

import java.util.List;
import java.util.Optional;

public interface ICiudadService {

    List<Ciudad> all();

    public Optional<Ciudad> findById(Long id);

    public Ciudad save(Ciudad ciudad);

    public void update(Ciudad ciudad, Long id);

    public void delete(Long id);
}
