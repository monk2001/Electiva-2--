package com.corhuila11.electiva111.IService;

import com.corhuila11.electiva111.entity.Pais;

import java.util.List;
import java.util.Optional;

public interface IPaisService {

    List<Pais> all();

    public Optional<Pais> findById(Long id);

    public Pais save(Pais pais);

    public void update(Pais pais, Long id);

    public void delete(Long id);
}
