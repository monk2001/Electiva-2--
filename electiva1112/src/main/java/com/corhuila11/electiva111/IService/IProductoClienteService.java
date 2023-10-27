package com.corhuila11.electiva111.IService;

import com.corhuila11.electiva111.entity.ProductoCliente;

import java.util.List;
import java.util.Optional;

public interface IProductoClienteService {

    List<ProductoCliente> all();

    public Optional<ProductoCliente> findById(Long id);

    public ProductoCliente save(ProductoCliente productoCliente);

    public void update(ProductoCliente productoCliente, Long id);

    public void delete(Long id);
}
