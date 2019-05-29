package day46_static_keyword;

public class Customer {

	private String name;
	private String email;
	
	static int count; //it is now shared by every objects
						// one central copy of this variable

	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}

	public Customer() {
		name = "undefined";
		email = "undefined";
		count++;

	}

	public Customer(String name, String email) {

		setName(name);
		setEmail(email);
		count++;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
