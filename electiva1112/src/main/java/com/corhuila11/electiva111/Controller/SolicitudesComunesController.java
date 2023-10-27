package com.corhuila11.electiva111.Controller;


import com.corhuila11.electiva111.IService.ISolicitudesComunesService;
import com.corhuila11.electiva111.entity.SolicitudesComunes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/SolicitudesComunes")

public class SolicitudesComunesController {

    @Autowired
    private ISolicitudesComunesService service;

    @GetMapping()
    public List<SolicitudesComunes> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<SolicitudesComunes> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public SolicitudesComunes save(@RequestBody SolicitudesComunes solicitudesComunes) {
        return service.save(solicitudesComunes);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@RequestBody SolicitudesComunes solicitudesComunes, @PathVariable Long id) {
        service.update(solicitudesComunes, id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}