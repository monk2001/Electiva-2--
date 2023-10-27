package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.IService.IUsuarioRolService;
import com.corhuila11.electiva111.entity.UsuarioRol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/UsuarioRol")

public class UsuarioRolController {

    @Autowired
    private IUsuarioRolService service;

    @GetMapping()
    public List<UsuarioRol> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<UsuarioRol> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public UsuarioRol save(@RequestBody UsuarioRol usuarioRol) {
        return service.save(usuarioRol);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@RequestBody UsuarioRol usuarioRol, @PathVariable Long id) {
        service.update(usuarioRol, id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}