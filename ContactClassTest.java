package Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class ContactClassTest {

	@Test
	void testContactClass() {
		ContactClass contactClass = new ContactClass("KA123", "Kingsley", "Amponsah", "2406872578", "10 Crusader Ct");
		assertTrue(contactClass.getcontactID().equals("KA123"));
		assertTrue(contactClass.getfirstName().equals("Kingsley"));
		assertTrue(contactClass.getlastName().equals("Amponsah"));
		assertTrue(contactClass.getphone().equals("2406872578"));
		assertTrue(contactClass.getaddress().equals("10 Cru Ct"));
		
	}
	
	@Test
	void testContactClasscontactIDToLong() {
		Assertions.assertThrows(IllegalArguementException.class, () -> {
			new ContactClass("KA123456789", "Kingsley", "Amponsah", "2406872578", "10 Crusader Ct");
		});
	}
	
	@Test
	void testContactClassfirstNameToLong() {
		Assertions.assertThrows(IllegalArguementException.class, () -> {
			new ContactClass("KA123", "BrotherKingsley", "Amponsah", "2406872578", "10 Crusader Ct");
		});
	}
		
	@Test
	void testContactClasslastNameToLong() {
		Assertions.assertThrows(IllegalArguementException.class, () -> {
			new ContactClass("KA123", "Kingsley", "OtiAmponsah", "2406872578", "10 Crusader Ct");
		});
	}	
	
	@Test
	void testContactClassphoneToLong() {
		Assertions.assertThrows(IllegalArguementException.class, () -> {
			new ContactClass("KA123", "Kingsley", "Amponsah", "+12406872578", "10 Crusader Ct");
		});
	}
	
	@Test
	void testContactClassaddressToLong() {
		Assertions.assertThrows(IllegalArguementException.class, () -> {
			new ContactClass("KA123", "Kingsley", "Amponsah", "2406872578", "10 Crusader Court Germantown Maryland 20874");
		});
	}
}
