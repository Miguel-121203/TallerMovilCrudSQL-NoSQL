package com.corhuila.tallerCrudNoSQL.Service;

import com.corhuila.tallerCrudNoSQL.Document.Autor;
import com.corhuila.tallerCrudNoSQL.IRepository.IAutorRepository;
import com.corhuila.tallerCrudNoSQL.IService.IAutorService;
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
    public Optional<Autor> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Autor save(Autor autor) {
        return repository.save(autor);
    }

    @Override
    public void update(Autor autor, String id) {
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
    public void delete(String id) {
        repository.deleteById(id);

    }
}
