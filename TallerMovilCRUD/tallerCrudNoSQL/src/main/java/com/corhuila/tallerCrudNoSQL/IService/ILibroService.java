package com.corhuila.tallerCrudNoSQL.IService;



import com.corhuila.tallerCrudNoSQL.Document.Libro;

import java.util.List;
import java.util.Optional;

public interface ILibroService {

    List<Libro> findAll();

    Optional<Libro> findById(String id);

    Libro save (Libro libro);

    void update (Libro libro, String id);

    void delete(String id);
}
