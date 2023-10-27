package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "persona")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "primer_nombre",nullable = true, unique = false, length = 50)
    private String primernombre;

    @Column(name = "segundo_nombre",nullable = false, unique = false, length = 50)
    private String segundonombre;


    @Column(name = "primer_apellido",nullable = true, unique = false, length = 50)
    private String primerapellido;

    @Column(name = "segundo_apellido",nullable = false, unique = false, length = 50)
    private String segundoapellido;

    @Column(name = "tipo_documento",nullable = true, unique = false, length = 50)
    private String tipo_documento;

    @Column(name = "identificacion",nullable = true, unique = true)
    private String identificacion;

    @Column(name = "genero",nullable = false, unique = false, length = 50)
    private String genero;

    @Column(name = "direccion",nullable = false, unique = false)
    private String direccion;

    @Column(name = "correo_electronico",nullable = true, unique = true)
    private String correo_electronico;

    @ManyToOne
    @JoinColumn(name = "id_ciudad")
    private Ciudad ciudadId;
    /**
     * relacion de personas a usuario
     *
     * @ManyToOne
     *     @JoinColumn(name = "usuario")
     *     private UsuarioEntity usuarioEntity;
     *
     */

/**
 * @OneToMany(mappedBy = "personaEntity",cascade = CascadeType.ALL)
 *     private List<CiudadEntity> ciudadentity;
 *
 *     @ManyToOne
 *     @JoinColumn(name = "idCiudad")
 *     private CiudadEntity ciudadEntity;
 */

}
