package com.corhuila11.electiva111.IRepository;

import com.corhuila11.electiva111.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository <Producto,Long> {
}
