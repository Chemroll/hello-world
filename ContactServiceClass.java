package contactAssignment;

import java.util.HashMap;
import java.util.Map;


public class ContactServiceClass {
	private Map<String, ContactClass> contacts = new HashMap<>();

	  public void addContact(Contact contact) {
	  if (contacts.containsKey(contact.getcontactID())) {
	  throw new IllegalArgumentException("Contact ID already exists");
	  }
	  contacts.put(contact.getcontactID(), contact);
	  }

	  public void deleteContact(String contactID) {
	  contacts.remove(contactID);
	  }

	  public void updateContact(String contactID, String firstName, String lastName, String phone, String address) {
	  ContactClass contact = contacts.get(contactID);
	  if (contact == null) {
	  throw new IllegalArgumentException("Contact ID does not exist");
	  }
	  contact.setFirstName(firstName);
	  contact.setLastName(lastName);
	  contact.setPhone(phone);
	  contact.setAddress(address);
	  }

}
