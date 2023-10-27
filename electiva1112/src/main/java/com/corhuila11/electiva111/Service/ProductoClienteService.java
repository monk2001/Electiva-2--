package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.IProductoClienteRepository;
import com.corhuila11.electiva111.IService.IProductoClienteService;
import com.corhuila11.electiva111.entity.ProductoCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoClienteService implements IProductoClienteService {

    @Autowired
    private IProductoClienteRepository iProductoClienteRepository;

    @Override
    public List<ProductoCliente> all() {
        return iProductoClienteRepository.findAll();
    }

    @Override
    public Optional<ProductoCliente> findById(Long id) {
        return iProductoClienteRepository.findById(id);
    }

    @Override
    public ProductoCliente save(ProductoCliente productoCliente) {
        return iProductoClienteRepository.save(productoCliente);
    }

    @Override
    public void update(ProductoCliente productoCliente, Long id) {
        //validar si existe.

        Optional<ProductoCliente> op = iProductoClienteRepository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            ProductoCliente productoClienteUpdate = op.get();
            productoClienteUpdate.setProductoId(productoCliente.getProductoId());
            productoClienteUpdate.setEstado(productoCliente.getEstado());
            productoClienteUpdate.setNumerocuenta(productoCliente.getNumerocuenta());
            productoClienteUpdate.setPersonaId(productoCliente.getPersonaId());


            //Actualizar el objeto
            iProductoClienteRepository.save(productoClienteUpdate);
        }

    }

    @Override
    public void delete(Long id) {
        iProductoClienteRepository.deleteById(id);
    }
}
