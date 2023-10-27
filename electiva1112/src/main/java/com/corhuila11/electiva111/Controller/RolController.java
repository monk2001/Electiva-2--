package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.IService.IRolService;
import com.corhuila11.electiva111.entity.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Rol")

public class RolController {

    @Autowired
    private IRolService service;

    @GetMapping()
    public List<Rol> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Rol> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Rol save(@RequestBody Rol rol) {
        return service.save(rol);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@RequestBody Rol rol, @PathVariable Long id) {
        service.update(rol, id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}