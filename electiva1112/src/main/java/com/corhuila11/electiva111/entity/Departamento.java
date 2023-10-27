package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "departamento")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Departamento {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "nombre",nullable = true, unique = false, length = 50)
        private String nombre;


        @ManyToOne
        @JoinColumn(name = "id_pais")
        private Pais paisId;



    }

