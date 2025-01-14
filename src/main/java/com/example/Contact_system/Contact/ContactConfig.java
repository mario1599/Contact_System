package com.example.Contact_system.Contact;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContactConfig {

    @Bean
    CommandLineRunner commandLineRunner(ContactRepository repository) {
        return args -> {
        Contact[] contacts = {
            new Contact("Mihkel Tamm", "ninja", "59621429"),
            new Contact("Kertu Metsa", "sparrow", "55512345"),
            new Contact("Jaanus Kase", "viking", "51123456"),
            new Contact("Laura Leht", "phoenix", "52098765"),
            new Contact("Mari Annus", "eagle", "51234567"),
            new Contact("Olev Põld", "wolf", "53098765"),
            new Contact("Liis Tamm", "falcon", "54432109"),
            new Contact("Erik Kase", "tiger", "59987654")
        };
        
        repository.saveAll(Arrays.asList(contacts));
        };
    }
}

