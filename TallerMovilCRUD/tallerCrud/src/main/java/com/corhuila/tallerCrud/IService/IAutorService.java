package com.corhuila.tallerCrud.IService;

import com.corhuila.tallerCrud.Entity.Autor;

import java.util.List;
import java.util.Optional;

public interface IAutorService {

    List<Autor> findAll();

    Optional<Autor> findById(Long id);

    Autor save (Autor autor);

    void update (Autor autor, Long id);

    void delete (Long id);


}
