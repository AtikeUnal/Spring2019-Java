package day44_encapsulation_constructor;

public class Email {

	
	String message;
	
	public Email(String message) {
		System.out.println("Sending email with message: "+message);
		
		this.message=message;
		
		
		//having only one constructor that has no arguments
		
	}
}
