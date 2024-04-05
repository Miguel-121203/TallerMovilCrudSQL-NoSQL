package com.corhuila.tallerCrud.Service;

import com.corhuila.tallerCrud.Entity.Libro;
import com.corhuila.tallerCrud.IRepository.ILibroRepository;
import com.corhuila.tallerCrud.IService.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService implements ILibroService {

    @Autowired
    private ILibroRepository repository;

    @Override
    public List<Libro> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Libro> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Libro save(Libro libro) {
        return repository.save(libro);
    }

    @Override
    public void update(Libro libro, Long id) {
        Optional<Libro> ps =repository.findById(id);

        if (!ps.isEmpty()){
            Libro libroUpdate = ps.get();
            libroUpdate.setTitulo(libro.getTitulo());
            libroUpdate.setIsbn(libro.getIsbn());
            libroUpdate.setGenero(libro.getGenero());
            libroUpdate.setAnioPublicacion(libro.getAnioPublicacion());
            libroUpdate.setSinopsis(libro.getSinopsis());

            repository.save(libroUpdate);
        }else {
            System.out.println("No existe el libro buscado");
        }

    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);

    }
}
