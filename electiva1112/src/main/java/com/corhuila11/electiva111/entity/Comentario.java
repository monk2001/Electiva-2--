package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;
import org.w3c.dom.Text;

import java.util.List;

@Entity
@Table(name = "comentario")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre_asesor",nullable = true, unique = false, length = 50)
    private String nombreasesor;

    @Column(name = "solucion",nullable = true, unique = false, length = 250)
    private String solucion;

    @Column(name = "calificacion",nullable = true, unique = false, length = 250)
    private String calificacion;

    @Column(name = "sugerencia",nullable = true, unique = false, length = 250)
    private String sugerencia;

    @ManyToOne
    @JoinColumn(name = "id_informacion_cliente")
    private InformacionCliente informacionClienteId;



}
