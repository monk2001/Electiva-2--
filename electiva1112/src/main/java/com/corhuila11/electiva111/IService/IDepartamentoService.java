package com.corhuila11.electiva111.IService;

import com.corhuila11.electiva111.entity.Departamento;

import java.util.List;
import java.util.Optional;

public interface IDepartamentoService {

    List<Departamento> all();

    public Optional<Departamento> findById(Long id);

    public Departamento save(Departamento departamento);

    public void update(Departamento departamento, Long id);

    public void delete(Long id);
}
