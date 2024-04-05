package com.corhuila.tallerCrud.IRepository;

import com.corhuila.tallerCrud.Entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorRepository extends JpaRepository<Autor,Long> {
}
