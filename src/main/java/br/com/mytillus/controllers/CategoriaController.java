package br.com.mytillus.controllers;

import br.com.mytillus.domain.Categoria;
import br.com.mytillus.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

    @Autowired
    public CategoriaService service;


    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
        Categoria obj = service.buscarPorId(id);
        return ResponseEntity.ok().body(obj);
    }

}
