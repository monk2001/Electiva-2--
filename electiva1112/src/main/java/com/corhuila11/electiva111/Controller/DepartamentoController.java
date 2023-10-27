package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.IService.IDepartamentoService;

import com.corhuila11.electiva111.entity.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Departamento")

public class DepartamentoController {

    @Autowired
    private IDepartamentoService service;

    @GetMapping()
    public List<Departamento> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Departamento> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Departamento save(@RequestBody Departamento departamento) {
        return service.save(departamento);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@RequestBody Departamento departamento, @PathVariable Long id) {
        service.update(departamento, id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
