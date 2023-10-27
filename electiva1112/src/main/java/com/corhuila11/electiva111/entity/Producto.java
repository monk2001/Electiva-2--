package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "producto")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "precio",nullable = false, unique = false)
    private Float precio;

    @Column(name = "tipo",nullable = false, unique = false, length = 100)
    private String tipo;

    @Column(name = "descripcion",nullable = true, unique = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_servicio")
    private Servicio servicioId;


}
