package com.corhuila11.electiva111.IService;

import com.corhuila11.electiva111.entity.SolicitudesComunes;

import java.util.List;
import java.util.Optional;

public interface ISolicitudesComunesService {

    List<SolicitudesComunes> all();

    public Optional<SolicitudesComunes> findById(Long id);

    public SolicitudesComunes save(SolicitudesComunes solicitudesComunes);

    public void update(SolicitudesComunes solicitudesComunes, Long id);

    public void delete(Long id);
}
