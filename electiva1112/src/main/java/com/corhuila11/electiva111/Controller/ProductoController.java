package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.IService.IProductoService;
import com.corhuila11.electiva111.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Producto")

public class ProductoController {

    @Autowired
    private IProductoService service;

    @GetMapping()
    public List<Producto> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Producto> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Producto save(@RequestBody Producto producto) {
        return service.save(producto);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@RequestBody Producto producto, @PathVariable Long id) {
        service.update(producto, id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}