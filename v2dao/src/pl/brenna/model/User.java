package pl.brenna.model;

public class User {
	private String pesel;
	private String firstName;
	private String lastName;
	
	public User(String pesel, String firstName, String lastName) {
		super();
		this.pesel = pesel;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public User() {}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
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
	
	
	
}
