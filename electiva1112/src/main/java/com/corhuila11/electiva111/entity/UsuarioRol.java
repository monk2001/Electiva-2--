package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario_rol")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuarioId;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rolId;
}
