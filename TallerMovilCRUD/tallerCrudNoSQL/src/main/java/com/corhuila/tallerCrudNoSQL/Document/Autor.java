package com.corhuila.tallerCrudNoSQL.Document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Document(collection = "autor")
@Data
public class Autor {
    @Id
    private String id;

    @Field
    private String nombre;

    @Field
    private String apellido;

    @Field
    private String nacionalidad;

    @Field
    private LocalDate fechaNacimiento;

    @Field
    private String biografia;

}
