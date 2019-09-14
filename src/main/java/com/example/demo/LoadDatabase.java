package com.example.demo;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner iniciarBase(EstudianteRepositorio repositorio){
        return args -> {
            log.info("Preloading " + repositorio.save(new Estudiante("Bilbo Baggins", 7304878)));
            log.info("Preloading " + repositorio.save(new Estudiante("Frodo Baggins", 7254645)));
        };
    }
}
