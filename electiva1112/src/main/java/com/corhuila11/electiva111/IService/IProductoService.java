package com.corhuila11.electiva111.IService;

import com.corhuila11.electiva111.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {

    List<Producto> all();

    public Optional<Producto> findById(Long id);

    public Producto save(Producto producto);

    public void update(Producto producto, Long id);

    public void delete(Long id);
}
