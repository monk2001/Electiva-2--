package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre",nullable = false, unique = false, length = 50)
    private String nombre;

    @Column(name = "contrasena",nullable = false, unique = false, length = 50)
    private String contrasena;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona",referencedColumnName = "id")
    private Persona personaId;


}
