package com.corhuila.tallerCrudNoSQL.IRepository;

import com.corhuila.tallerCrudNoSQL.Document.Autor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorRepository extends MongoRepository<Autor,String > {
}
