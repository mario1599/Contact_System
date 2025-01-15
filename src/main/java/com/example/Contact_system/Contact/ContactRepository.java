package com.example.Contact_system.Contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository
        extends JpaRepository<Contact, Long> {
    Contact getContactById(Long id);
}
