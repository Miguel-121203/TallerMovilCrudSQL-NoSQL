package com.corhuila.tallerCrud.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "libro")
public class Libro {
    //Creacion de llave primaria con auto incrementable
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // llave primaria de tipo id

    // Atributos de la clase
    @Column(name = "titulo", length = 50, nullable = false)
    private String titulo;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "genero",length = 30, nullable = false)
    private String genero;

    @Column(name = "anio_publicacion", length = 4, nullable = false )
    private int anioPublicacion;

    @Column(name = "sinopsis", nullable = false)
    private String sinopsis;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "autor_id", nullable = false)
    private Autor autor;





}
