package com.corhuila11.electiva111.IService;


import com.corhuila11.electiva111.entity.UsuarioRol;

import java.util.List;
import java.util.Optional;

public interface IUsuarioRolService {

    List<UsuarioRol> all();

    public Optional<UsuarioRol> findById(Long id);

    public UsuarioRol save(UsuarioRol usuarioRol);

    public void update(UsuarioRol usuarioRol, Long id);

    public void delete(Long id);
}
