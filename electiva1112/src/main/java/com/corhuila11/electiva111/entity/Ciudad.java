package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "ciudad")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre",nullable = false, unique = false, length = 50)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private Departamento departamentoId;



    /**
     * duda sobre relacion
     * @ManyToOne
     *     @JoinColumn(name = "persona")
     *      private Persona persona;
     *
     *
     *        @OneToMany(mappedBy = "ciudad",cascade = CascadeType.ALL)
     *     private List<Persona> persona;
     */

    /**
     * cuando es de ciudad a persona
     * @ManyToOne
     *     @JoinColumn(name = "idPersona")
     *     private PersonaEntity personaEntity;
     *
     * cuando es de persona a ciudad
     *     @OneToMany(mappedBy = "ciudadEntity",cascade = CascadeType.ALL)
     *     private List<PersonaEntity> personaEntity;
     */


}
