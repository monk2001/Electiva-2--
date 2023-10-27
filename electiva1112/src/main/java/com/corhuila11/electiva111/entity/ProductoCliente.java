package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "producto_cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductoCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "estado",nullable = false, unique = false)
    private Boolean estado;

    @Column(name = "numero_cuenta",nullable = false, unique = true, length = 50)
    private String numerocuenta;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona personaId;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto productoId;



}
