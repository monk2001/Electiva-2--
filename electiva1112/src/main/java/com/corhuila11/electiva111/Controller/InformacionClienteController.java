package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.IService.IInformacionClienteService;

import com.corhuila11.electiva111.entity.InformacionCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/InformacionCliente")

public class InformacionClienteController {

    @Autowired
    private IInformacionClienteService service;

    @GetMapping()
    public List<InformacionCliente> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<InformacionCliente> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public InformacionCliente save(@RequestBody InformacionCliente informacionCliente) {
        return service.save(informacionCliente);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@RequestBody InformacionCliente informacionCliente, @PathVariable Long id) {
        service.update(informacionCliente, id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

