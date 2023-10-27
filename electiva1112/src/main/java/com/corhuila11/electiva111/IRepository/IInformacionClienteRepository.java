package com.corhuila11.electiva111.IRepository;

import com.corhuila11.electiva111.entity.InformacionCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInformacionClienteRepository extends JpaRepository <InformacionCliente,Long> {
}
