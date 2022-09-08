package br.com.mytillus.services;

import br.com.mytillus.domain.Categoria;
import br.com.mytillus.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    public CategoriaRepository repository;

    public Categoria buscarPorId(Integer id){
        Optional<Categoria> buscar = repository.findById(id);
        return buscar.orElse(null);
    }
}
