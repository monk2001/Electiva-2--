package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;
import org.w3c.dom.Text;

@Entity
@Table(name = "informacion_cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InformacionCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "numero_radicado",nullable = true, unique = true, length = 50)
    private String numeroradicado;

    @Column(name = "titulo",nullable = true, unique = false, length = 150)
    private String titulo;

    @Column(name = "tipo_solicitud",nullable = true, unique = false, length = 150)
    private String tiposolicitud;

    @Column(name = "descripcion",nullable = true, unique = false, length = 200)
    private String descripcion;

    @Column(name = "estado",nullable = true, unique = false, length = 50)
    private Boolean estado;

    @Column(name = "duracion_servicio",nullable = true, unique = false, length = 200)
    private String duracionservicio;

    @ManyToOne
    @JoinColumn(name = "id_producto_cliente")
    private ProductoCliente productoClienteId;

}
