package com.example.Contact_system.Contact;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> getContacts() {
        return contactRepository.findAll();
    }

    public String addContact(String nimi, String koodNimi, String telefon) {

        Contact contact = new Contact(nimi, koodNimi, telefon);

        if (nimi.length() > 20 || koodNimi.length() > 20 || telefon.length() > 10) {
            return "Parameetrid ei vasta nõuetele";
        }
        contactRepository.save(contact);
        return "ok";

    }

    public String deleteContact(Long id) {
       Optional<Contact> contact = contactRepository.findById(id);

        if (contact.isEmpty()) {
            return "ei leitud kontakti";
        }
        contactRepository.delete(contact.get());
        return "kontakt kustutatud";

    }
}