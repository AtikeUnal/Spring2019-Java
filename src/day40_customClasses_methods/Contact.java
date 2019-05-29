package day40_customClasses_methods;

public class Contact {

	
	
	String name;
	String phoneNumber;
	String email;
	
	// behaviour call sendMessage sendEmail
	
	public void call() {
		System.out.println("Calling..."+name);
	}
		
	public void phoneNumber() {
		System.out.println("phone number "+phoneNumber);
	}
	public void sendEmail() {
		System.out.println("sending Email to: "+email);
	}
	public void sendMessage() {
		System.out.println("Send Message: "+name+" | "+phoneNumber);
	}
}
