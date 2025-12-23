
package com.example.catalogo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatalogoLibrosApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CatalogoLibrosApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Catálogo de Libros iniciado (Spring Boot Consola)");
        System.out.println("Aquí se ejecuta el menú por consola.");
    }
}
