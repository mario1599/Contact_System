package com.example.Contact_system.Contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/contact")
public class ContactController {

    private final ContactService contactService;

    @GetMapping
    public List<Contact> getContacts() {
        return contactService.getContacts();
    }
}
