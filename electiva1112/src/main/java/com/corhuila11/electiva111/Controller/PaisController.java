package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.IService.IPaisService;
import com.corhuila11.electiva111.entity.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Pais")

public class PaisController {

    @Autowired
    private IPaisService service;

    @GetMapping()
    public List<Pais> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Pais> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Pais save(@RequestBody Pais pais) {
        return service.save(pais);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@RequestBody Pais pais, @PathVariable Long id) {
        service.update(pais, id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

