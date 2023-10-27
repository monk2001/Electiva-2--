package com.corhuila11.electiva111.IService;

import com.corhuila11.electiva111.entity.Comentario;

import java.util.List;
import java.util.Optional;

public interface IComentarioService {

    List<Comentario> all();

    public Optional<Comentario> findById(Long id);

    public Comentario save(Comentario comentario);

    public void update(Comentario comentario, Long id);

    public void delete(Long id);
}
