package com.corhuila11.electiva111.IService;

import com.corhuila11.electiva111.entity.InformacionCliente;

import java.util.List;
import java.util.Optional;

public interface IInformacionClienteService {

    List<InformacionCliente> all();

    public Optional<InformacionCliente> findById(Long id);

    public InformacionCliente save(InformacionCliente informacionCliente);

    public void update(InformacionCliente informacionCliente, Long id);

    public void delete(Long id);
}
