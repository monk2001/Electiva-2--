package com.corhuila11.electiva111.IRepository;

import com.corhuila11.electiva111.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartamentoRepository extends JpaRepository <Departamento,Long> {
}
