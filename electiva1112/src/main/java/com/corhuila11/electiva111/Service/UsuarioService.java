package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.IUsuarioRepository;
import com.corhuila11.electiva111.IService.IUsuarioService;
import com.corhuila11.electiva111.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService  implements IUsuarioService {
    @Autowired
    private IUsuarioRepository iUsuarioRepository;

    @Override
    public List<Usuario> all() {
        return iUsuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return iUsuarioRepository.findById(id);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return iUsuarioRepository.save(usuario);
    }

    @Override
    public void update(Usuario usuario, Long id) {
        //validar si existe.

        Optional<Usuario> op = iUsuarioRepository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Usuario usuarioUpdate = op.get();
            usuarioUpdate.setNombre(usuario.getNombre());
            usuarioUpdate.setContrasena(usuario.getContrasena());
            usuarioUpdate.setPersonaId(usuario.getPersonaId());



            //Actualizar el objeto
            iUsuarioRepository.save(usuarioUpdate);
        }

    }

    @Override
    public void delete(Long id) {
        iUsuarioRepository.deleteById(id);
    }


}
