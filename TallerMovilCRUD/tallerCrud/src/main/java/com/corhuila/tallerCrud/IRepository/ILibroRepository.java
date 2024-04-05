package com.corhuila.tallerCrud.IRepository;

import com.corhuila.tallerCrud.Entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroRepository extends JpaRepository<Libro,Long> {
}
