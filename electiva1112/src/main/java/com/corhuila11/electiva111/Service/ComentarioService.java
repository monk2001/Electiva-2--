package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.IComentarioRepository;
import com.corhuila11.electiva111.IService.IComentarioService;
import com.corhuila11.electiva111.entity.Comentario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ComentarioService implements IComentarioService {

    @Autowired
    private IComentarioRepository iComentarioRepository;

    @Override
    public List<Comentario> all() {
        return iComentarioRepository.findAll();
    }

    @Override
    public Optional<Comentario> findById(Long id) {
        return iComentarioRepository.findById(id);
    }

    @Override
    public Comentario save(Comentario comentario) {
        return iComentarioRepository.save(comentario);
    }

    @Override
    public void update(Comentario comentario, Long id) {
        //validar si existe.

        Optional<Comentario> op = iComentarioRepository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Comentario comentarioUpdate = op.get();
            comentarioUpdate.setCalificacion(comentario.getCalificacion());
            comentarioUpdate.setSolucion(comentario.getSolucion());
            comentarioUpdate.setSugerencia(comentario.getSugerencia());
            comentarioUpdate.setNombreasesor(comentario.getNombreasesor());
            comentarioUpdate.setInformacionClienteId(comentario.getInformacionClienteId());



            //Actualizar el objeto
            iComentarioRepository.save(comentarioUpdate);
        }

    }

    @Override
    public void delete(Long id) {
        iComentarioRepository.deleteById(id);
    }
}
