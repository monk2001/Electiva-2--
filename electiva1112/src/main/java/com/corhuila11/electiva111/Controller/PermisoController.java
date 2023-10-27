package com.corhuila11.electiva111.Controller;


import com.corhuila11.electiva111.IService.IPermisoService;
import com.corhuila11.electiva111.entity.Permiso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Permiso")

public class PermisoController {

    @Autowired
    private IPermisoService service;

    @GetMapping()
    public List<Permiso> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Permiso> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Permiso save(@RequestBody Permiso permiso) {
        return service.save(permiso);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@RequestBody Permiso permiso, @PathVariable Long id) {
        service.update(permiso, id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

