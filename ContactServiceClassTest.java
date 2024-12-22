package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactServiceClassTest {

	private ContactServiceClass contactService;

    @Test
    public void testAddContact() {
        ContactClass contact = new ContactClass("KA123", "Kingsley", "Amponsah", "2406872578", "10 Crusader Ct");
        assertTrue(contactService.addContact(contact));
    }

    @Test
    public void testDeleteContact() {
        ContactClass contact = new ContactClass("KA123", "Kingsley", "Amponsah", "2406872578", "10 Crusader Ct");
        contactService.addContact(contact);
        assertTrue(contactService.deleteContact("KA123", "Kingsley", "Amponsah", "2406872578", "10 Crusader Ct"));
    }

    @Test
    public void testUpdateFirstName() {
        ContactClass contactClass = new Contact("KA123", "Kingsley", "Amponsah", "2406872578", "10 Crusader Ct");
        contactService.addContact(contact);
        assertTrue(contactService.updateContactFirstName("Michael"));
        assertEquals("Michael", contactService.getContact().getFirstName());
    }

    @Test
    public void testUpdateLastName() {
        ContactClass contact = new ContactClass("KA123", "Kingsley", "Amponsah", "2406872578", "10 Crusader Ct");
        contactService.addContact(contact);
        assertTrue(contactService.updateContactLastName("Jackson"));
        assertEquals("Jackson", contactService.getContact().getLastName());
    }

    @Test
    public void testUpdatePhone() {
        ContactClass contact = new ContactClass("KA123", "Kingsley", "Amponsah", "2406872578", "10 Crusader Ct");
        contactService.addContact(contact);
        assertTrue(contactService.updateContactPhone("2029639171"));
        assertEquals("2029639171", contactService.getContact().getPhone());
    }

    @Test
    public void testUpdateAddress() {
        ContactClass contact = new ContactClass("KA123", "Kingsley", "Amponsah", "2406872578", "10 Crusader Ct");
        contactService.addContact(contact);
        assertTrue(contactService.updateContactAddress("1313 Moore Spring Ct"));
        assertEquals("1313 More Spring Ct", contactService.getContact().getAddress());
    }
}
