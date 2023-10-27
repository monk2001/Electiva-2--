package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;
import org.w3c.dom.Text;

@Entity
@Table(name = "servicio")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "descripcion",nullable = true, unique = false)
    private String descripcion;


}
