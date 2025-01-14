package com.example.Contact_system.Contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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

    
public String addContact( String nimi,  String koodNimi,  String telefon) {
    Contact contact = new Contact(nimi,koodNimi,telefon);
    contactRepository.save(contact);
    return "ok";
}


}
