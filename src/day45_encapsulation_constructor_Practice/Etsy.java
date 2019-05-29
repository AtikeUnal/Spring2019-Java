package day45_encapsulation_constructor_Practice;
import java.util.*;
public class Etsy {

	private String email;
	private String firstName;
	private String password;

	// constructor 1
	public Etsy() {
		email = "";
		firstName = "";
		password = "";

	}

	public Etsy(String email, String firstName, String password) {
		
		this.setEmail(email);
		setFirstName(firstName);
		setPassword(password);

	}
	
	public Etsy(String email,String firstName) {
		setEmail(email);
		setFirstName(firstName);
		this.password=getRandomPassword();
		
	}
	private String getRandomPassword() {
		Random rnd=new Random();
		String letters="abcdefghijklmnopqrstuvwxyz1234567890";
		String rdPassword="";
		for(int i=0; i<=6; i++) {
			rdPassword+=letters.charAt(rnd.nextInt(letters.length() ));
		}
		return rdPassword;
	}

	public String toString() {
		return "Etsy [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
	}

	public String getEmail() {
		
		return email;
	}

	public void setEmail(String email) {
		//if it contains @ somewhere in the middle assign it
				//if not print "Please enter a valid email address."
				
		if(email.indexOf("@")>0 &&email.indexOf("@")!= email.length()-1) {
			
		this.email = email;
		
		}else {
			System.out.println("Please enter a valid email address.");
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		//cant't be blank
		//needs to be only Alphabetic
		if(isValidFirstName(firstName)) {
			this.firstName = firstName;
		}else {
			System.out.println("Your first name contains invalid characters.");
		}
	}
		
	
/*
 * valid-->all letters can have space in middle
 * invalid ->cannot contain numbers
 */
	private boolean isValidFirstName(String firstName) {
		//check first if it starts or ends with space
		
		if(firstName.startsWith(" ")||firstName.endsWith(" ")) {
			return false;
		}
		
		for(int i=0;i<firstName.length();i++) {
			char ch=firstName.charAt(i);
			if(!Character.isAlphabetic(ch)&& ch!=' ') {
				return false;
			}
		}
		
			if(firstName.isEmpty()) {
				System.out.println("Cannot be blank");
				return false;
			
		}
	
	return true;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		
		if(password.length()< 6 ) {
			System.out.println("Must be at least 6 characters");
			this.password="";
		}else {
			this.password = password;
		}
		
	}

}
