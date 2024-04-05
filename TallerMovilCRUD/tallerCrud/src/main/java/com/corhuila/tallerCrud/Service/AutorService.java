package com.corhuila.tallerCrud.Service;

import com.corhuila.tallerCrud.Entity.Autor;
import com.corhuila.tallerCrud.IRepository.IAutorRepository;
import com.corhuila.tallerCrud.IService.IAutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService implements IAutorService {

    @Autowired
    private IAutorRepository repository;


    @Override
    public List<Autor> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Autor> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Autor save(Autor autor) {
        return repository.save(autor);
    }

    @Override
    public void update(Autor autor, Long id) {
        Optional<Autor> ps = repository.findById(id);

        if (!ps.isEmpty()){
            Autor autorUpdate = ps.get();
            autorUpdate.setNombre(autor.getNombre());
            autorUpdate.setApellido(autor.getApellido());
            autorUpdate.setNacionalidad(autor.getNacionalidad());
            autorUpdate.setFechaNacimiento(autor.getFechaNacimiento());
            autorUpdate.setBiografia(autor.getBiografia());
            repository.save(autorUpdate);
        }else {
            System.out.println("No existe el autor");
        }
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);

    }
}
