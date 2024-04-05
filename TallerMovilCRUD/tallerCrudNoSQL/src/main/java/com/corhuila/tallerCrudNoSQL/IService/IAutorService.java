package com.corhuila.tallerCrudNoSQL.IService;



import com.corhuila.tallerCrudNoSQL.Document.Autor;

import java.util.List;
import java.util.Optional;

public interface IAutorService {

    List<Autor> findAll();

    Optional<Autor> findById(String id);

    Autor save (Autor autor);

    void update (Autor autor, String id);

    void delete (String id);


}
