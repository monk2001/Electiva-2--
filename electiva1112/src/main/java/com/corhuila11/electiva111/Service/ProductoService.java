package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.IProductoRepository;
import com.corhuila11.electiva111.IService.IProductoService;
import com.corhuila11.electiva111.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private IProductoRepository iProductoRepository;

    @Override
    public List<Producto> all() {
        return iProductoRepository.findAll();
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return iProductoRepository.findById(id);
    }

    @Override
    public Producto save(Producto producto) {
        return iProductoRepository.save(producto);
    }

    @Override
    public void update(Producto producto, Long id) {
        //validar si existe.

        Optional<Producto> op = iProductoRepository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Producto productoUpdate = op.get();
            productoUpdate.setDescripcion(producto.getDescripcion());
            productoUpdate.setTipo(producto.getTipo());
            productoUpdate.setPrecio(producto.getPrecio());
            productoUpdate.setServicioId(producto.getServicioId());


            //Actualizar el objeto
            iProductoRepository.save(productoUpdate);
        }

    }

    @Override
    public void delete(Long id) {
        iProductoRepository.deleteById(id);
    }
}
