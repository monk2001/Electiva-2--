package com.corhuila11.electiva111.IService;

import com.corhuila11.electiva111.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {

    List<Usuario> all();

    public Optional<Usuario> findById(Long id);

    public Usuario save(Usuario usuario);

    public void update(Usuario usuario, Long id);

    public void delete(Long id);
}
