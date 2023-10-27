package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.IService.IProductoClienteService;

import com.corhuila11.electiva111.entity.ProductoCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/ProductoCliente")

public class ProductoClienteController {

    @Autowired
    private IProductoClienteService service;

    @GetMapping()
    public List<ProductoCliente> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<ProductoCliente> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ProductoCliente save(@RequestBody ProductoCliente productoCliente) {
        return service.save(productoCliente);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@RequestBody ProductoCliente productoCliente, @PathVariable Long id) {
        service.update(productoCliente, id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}