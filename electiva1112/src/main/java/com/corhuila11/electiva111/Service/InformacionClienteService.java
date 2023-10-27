package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.IInformacionClienteRepository;
import com.corhuila11.electiva111.IService.IInformacionClienteService;
import com.corhuila11.electiva111.entity.InformacionCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Service
public class InformacionClienteService implements IInformacionClienteService {

    @Autowired
    private IInformacionClienteRepository iInformacionClienteRepository;

    @Override
    public List<InformacionCliente> all() {
        return iInformacionClienteRepository.findAll();
    }

    @Override
    public Optional<InformacionCliente> findById(Long id) {
        return iInformacionClienteRepository.findById(id);
    }

    @Override
    public InformacionCliente save(InformacionCliente informacionCliente) {
        return iInformacionClienteRepository.save(informacionCliente);
    }

    @Override
    public void update(InformacionCliente informacionCliente, Long id) {
        //validar si existe.

        Optional<InformacionCliente> op = iInformacionClienteRepository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            InformacionCliente informacionClienteUpdate = op.get();
            informacionClienteUpdate.setProductoClienteId(informacionCliente.getProductoClienteId());
            informacionClienteUpdate.setDescripcion(informacionCliente.getDescripcion());
            informacionClienteUpdate.setEstado(informacionCliente.getEstado());
            informacionClienteUpdate.setDuracionservicio(informacionCliente.getDuracionservicio());
            informacionClienteUpdate.setNumeroradicado(informacionCliente.getNumeroradicado());
            informacionClienteUpdate.setTiposolicitud(informacionCliente.getTiposolicitud());
            informacionClienteUpdate.setTitulo(informacionCliente.getTitulo());

            //Actualizar el objeto
            iInformacionClienteRepository.save(informacionClienteUpdate);
        }

    }

    @Override
    public void delete(Long id) {
        iInformacionClienteRepository.deleteById(id);
    }
}
