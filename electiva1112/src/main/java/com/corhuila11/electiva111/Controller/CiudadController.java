package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.IService.ICiudadService;
import com.corhuila11.electiva111.entity.Ciudad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


    @CrossOrigin(origins = "*")
    @RestController
    @RequestMapping("v1/api/Ciudad")

    public class CiudadController {

        @Autowired
        private ICiudadService service;

        @GetMapping()
        public List<Ciudad> all() {
            return service.all();
        }

        @GetMapping("{id}")
        public Optional<Ciudad> show(@PathVariable Long id) {
            return service.findById(id);
        }

        @PostMapping
        @ResponseStatus(code = HttpStatus.CREATED)
        public Ciudad save(@RequestBody Ciudad ciudad) {
            return service.save(ciudad);
        }

        @PutMapping("{id}")
        @ResponseStatus(code = HttpStatus.NO_CONTENT)
        public void update(@RequestBody Ciudad ciudad, @PathVariable Long id) {
            service.update(ciudad, id);
        }

        @DeleteMapping("{id}")
        @ResponseStatus(code = HttpStatus.NO_CONTENT)
        public void delete(@PathVariable Long id) {
            service.delete(id);
        }

    }
