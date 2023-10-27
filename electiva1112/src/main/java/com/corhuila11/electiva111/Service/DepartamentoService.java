package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.IDepartamentoRepository;
import com.corhuila11.electiva111.IService.IDepartamentoService;
import com.corhuila11.electiva111.entity.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService implements IDepartamentoService {

    @Autowired
    private IDepartamentoRepository iDepartamentoRepository;

    @Override
    public List<Departamento> all() {
        return iDepartamentoRepository.findAll();
    }

    @Override
    public Optional<Departamento> findById(Long id) {
        return iDepartamentoRepository.findById(id);
    }

    @Override
    public Departamento save(Departamento departamento) {
        return iDepartamentoRepository.save(departamento);
    }

    @Override
    public void update(Departamento departamento, Long id) {
        //validar si existe.

        Optional<Departamento> op = iDepartamentoRepository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Departamento departamentoUpdate = op.get();
            departamentoUpdate.setNombre(departamento.getNombre());
            departamentoUpdate.setPaisId(departamento.getPaisId());


            //Actualizar el objeto
            iDepartamentoRepository.save(departamentoUpdate);
        }

    }

    @Override
    public void delete(Long id) {
        iDepartamentoRepository.deleteById(id);
    }
}
