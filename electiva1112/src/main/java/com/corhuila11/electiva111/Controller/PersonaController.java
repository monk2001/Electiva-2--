package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.IService.IPersonaService;
import com.corhuila11.electiva111.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Persona")

public class PersonaController {

    @Autowired
    private IPersonaService service;

    @GetMapping()
    public List<Persona> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Persona> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Persona save(@RequestBody Persona persona) {
        return service.save(persona);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@RequestBody Persona persona, @PathVariable Long id) {
        service.update(persona, id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}