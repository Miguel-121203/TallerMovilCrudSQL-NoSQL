package com.corhuila.tallerCrud.IService;

import com.corhuila.tallerCrud.Entity.Libro;

import java.util.List;
import java.util.Optional;

public interface ILibroService {

    List<Libro> findAll();

    Optional<Libro> findById (Long id);

    Libro save (Libro libro);

    void update (Libro libro, Long id);

    void delete(Long id);
}
