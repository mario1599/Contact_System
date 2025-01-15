package com.example.Contact_system;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Contact_system.Contact.ContactRepository;
import com.example.Contact_system.Contact.ContactService;

@SpringBootTest
class ContactSystemApplicationTests {
	@InjectMocks
	private ContactService contactService;

	@Mock
	private ContactRepository contactRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testAddContact_success() {
		String result = contactService.addContact("Mihkel Tamm", "kalur", "51625622");
		assertEquals("ok", result);
	}

	@Test
	void testAddContact_failed() {
		String result = contactService.addContact("Mihkel Tammaaaaaaaaaaaaaaaaa", "kalur", "51625622");
		assertEquals("Parameetrid ei vasta nõuetele", result);
	}

	@Test
	void testDeleteContact_failed() {
		String result = contactService.deleteContact(200L);
		assertEquals("ei leitud kontakti", result);
	}

}
