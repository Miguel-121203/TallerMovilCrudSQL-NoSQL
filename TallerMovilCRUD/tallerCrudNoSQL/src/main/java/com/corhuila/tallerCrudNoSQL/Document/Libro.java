package com.corhuila.tallerCrudNoSQL.Document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "libro")
@Data
public class Libro {

   @Id
    private String id;

    @Field
    private String titulo;

    @Field
    private String isbn;

    @Field
    private String genero;

    @Field
    private int anioPublicacion;

    @Field
    private String sinopsis;

    @DBRef
    private Autor autor;
}
