package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.IService.IComentarioService;
import com.corhuila11.electiva111.entity.Comentario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Comentario")

public class ComentarioController {

    @Autowired
    private IComentarioService service;

    @GetMapping()
    public List<Comentario> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Comentario> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Comentario save(@RequestBody Comentario comentario) {
        return service.save(comentario);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@RequestBody Comentario comentario, @PathVariable Long id) {
        service.update(comentario, id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
