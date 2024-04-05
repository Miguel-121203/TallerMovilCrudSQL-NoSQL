package com.corhuila.tallerCrud.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre",nullable = false,length = 50)
    private String nombre;

    @Column(name = "apellido",nullable = false,length = 50)
    private String apellido;

    @Column(name = "nacionalidad",nullable = false,length = 50)
    private String nacionalidad;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "biografia", nullable = false)
    private String biografia;


}
