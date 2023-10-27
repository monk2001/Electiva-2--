package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "rol")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre",nullable = false, unique = false, length = 50)
    private String nombre;


}
