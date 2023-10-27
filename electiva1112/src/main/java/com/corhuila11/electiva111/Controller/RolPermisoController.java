package com.corhuila11.electiva111.Controller;


import com.corhuila11.electiva111.IService.IRolPermisoService;
import com.corhuila11.electiva111.entity.RolPermiso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/RolPermiso")

public class RolPermisoController {

    @Autowired
    private IRolPermisoService service;

    @GetMapping()
    public List<RolPermiso> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<RolPermiso> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public RolPermiso save(@RequestBody RolPermiso rolPermiso) {
        return service.save(rolPermiso);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@RequestBody RolPermiso rolPermiso, @PathVariable Long id) {
        service.update(rolPermiso, id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
