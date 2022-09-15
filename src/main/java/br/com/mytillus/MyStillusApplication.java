package br.com.mytillus;

import br.com.mytillus.domain.Categoria;
import br.com.mytillus.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MyStillusApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(MyStillusApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Categoria ca1 = new Categoria(null, "Informatica");
        Categoria ca2 = new Categoria(null, "Escritorio");

        repository.saveAll(Arrays.asList(ca1,ca2));


    }
}
