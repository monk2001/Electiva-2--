package com.corhuila11.electiva111.Controller;


import com.corhuila11.electiva111.IService.IUsuarioService;
import com.corhuila11.electiva111.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Usuario")

public class UsuarioController {

    @Autowired
    private IUsuarioService service;

    @GetMapping()
    public List<Usuario> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Usuario> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Usuario save(@RequestBody Usuario usuario) {
        return service.save(usuario);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@RequestBody Usuario usuario, @PathVariable Long id) {
        service.update(usuario, id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}