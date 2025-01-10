package com.example.Contact_system.Contact;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContactConfig {

    @Bean
    CommandLineRunner commandLineRunner(ContactRepository repository) {
        return args -> {
                Contact kontakt1 = new Contact("Mihkel Tamm", "ninja", "59621429");
                Contact kontakt2 = new Contact("Kertu Metsa", "sparrow", "55512345");
                Contact kontakt3 = new Contact("Jaanus Kase", "viking", "51123456");
                Contact kontakt4 = new Contact("Laura Leht", "phoenix", "52098765");
                repository.saveAll(List.of(kontakt1,kontakt2,kontakt3,kontakt4));
            };
          
        };
    }

