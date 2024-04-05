package com.corhuila.tallerCrudNoSQL.IRepository;

import com.corhuila.tallerCrudNoSQL.Document.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroRepository extends MongoRepository<Libro,String > {
}
