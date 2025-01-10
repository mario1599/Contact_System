package com.example.Contact_system.Contact;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="contacts")
public class Contact {
    @Id
    @SequenceGenerator(
name = "client_sequence",
sequenceName = "client_sequence",
allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "client_sequence"
    )
    private Long id;
    private String nimi;
    private String koodNimi;
    private String telefon;

    // Constructor
    public Contact () {
        
    }

    public Contact( String nimi, String koodNimi, String telefon) {
        this.nimi = nimi;
        this.koodNimi = koodNimi;
        this.telefon = telefon;
    }
    public Long getId(){
        return id;
    }

    public String getNimi() {
        return nimi;
    }

    public String getKoodNimi() {
        return koodNimi;
    }

    public String getTelefon() {
        return telefon;
    }
}
