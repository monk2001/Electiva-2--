package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.ISolicitudesComunesRepository;
import com.corhuila11.electiva111.IService.ISolicitudesComunesService;
import com.corhuila11.electiva111.entity.SolicitudesComunes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SolicitudesComunesService implements ISolicitudesComunesService {
    @Autowired
    private ISolicitudesComunesRepository iSolicitudesComunesRepository;

    @Override
    public List<SolicitudesComunes> all() {
        return iSolicitudesComunesRepository.findAll();
    }

    @Override
    public Optional<SolicitudesComunes> findById(Long id) {
        return iSolicitudesComunesRepository.findById(id);
    }

    @Override
    public SolicitudesComunes save(SolicitudesComunes solicitudesComunes) {
        return iSolicitudesComunesRepository.save(solicitudesComunes);
    }

    @Override
    public void update(SolicitudesComunes solicitudesComunes, Long id) {
        //validar si existe.

        Optional<SolicitudesComunes> op = iSolicitudesComunesRepository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            SolicitudesComunes solicitudesComunesUpdate = op.get();
            solicitudesComunesUpdate.setDescripcion(solicitudesComunes.getDescripcion());
            solicitudesComunesUpdate.setPosiblesolucion(solicitudesComunes.getPosiblesolucion());
            solicitudesComunesUpdate.setRecomendacion(solicitudesComunes.getRecomendacion());
            solicitudesComunesUpdate.setServicioId(solicitudesComunes.getServicioId());


            //Actualizar el objeto
            iSolicitudesComunesRepository.save(solicitudesComunesUpdate);
        }

    }

    @Override
    public void delete(Long id) {
        iSolicitudesComunesRepository.deleteById(id);
    }



}

