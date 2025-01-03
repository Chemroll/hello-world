package contactAssignment;

public class ContactClass {
	  private String contactID;
	  private String firstName;
	  private String lastName;
	  private String phone;
	  private String address;

	  public ContactClass(String contactID, String firstName, String lastName, String phone, String address) {
	  if (contactID == null || contactID.length() > 10 || firstName == null || firstName.length() > 10 || lastName == null || lastName.length() > 10 || phone == null || phone.length() != 10 || address == null || address.length() > 30) {
	  throw new IllegalArgumentException("Invalid argument");
	  }
	  this.contactID = contactID;
	  this.firstName = firstName;
	  this.lastName = lastName;
	  this.phone = phone;
	  this.address = address;
	  }
	  
	  public String getcontactID() {
	        return contactID;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }
}
