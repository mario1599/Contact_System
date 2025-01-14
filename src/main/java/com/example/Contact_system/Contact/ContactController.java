package com.example.Contact_system.Contact;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping(path = "api/v1/contact")
public class ContactController {

    private final ContactService contactService;

    @GetMapping
    public List<Contact> getContacts() {
        return contactService.getContacts();
    }

    @PostMapping(path = "add-contact")
    public ResponseEntity<String> addContact(@RequestParam String nimi, @RequestParam String koodNimi,
            @RequestParam String telefon) {

        String result = contactService.addContact(nimi, koodNimi, telefon);
        if (result == "ok") {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(400).body(result);
        }

    }

    @DeleteMapping(path = "delete-contact")
    public ResponseEntity<String> deletecontact(@RequestParam Long id) {

        String result = contactService.deleteContact(id);
        if (result == "kontakt kustutatud") {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(400).body(result);
        }

    }

}
