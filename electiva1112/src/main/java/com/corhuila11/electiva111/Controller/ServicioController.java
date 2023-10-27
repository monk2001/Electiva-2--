package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.IService.IServicioService;
import com.corhuila11.electiva111.entity.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Servicio")

public class ServicioController {

    @Autowired
    private IServicioService service;

    @GetMapping()
    public List<Servicio> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Servicio> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Servicio save(@RequestBody Servicio servicio) {
        return service.save(servicio);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@RequestBody Servicio servicio, @PathVariable Long id) {
        service.update(servicio, id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}