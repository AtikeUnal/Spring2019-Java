package day11_logical_nestrdif;
import java.util.*;
public class LogInTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new  Scanner(System.in);
		
		String username;
		String password;
		
		String validUsername="cybertek@gmail.com";
		String validPassword="WoodenSpoon123";
		
		System.out.println("Enter username: ");
		username=scan.next();
	System.out.println("Enter password: ");
		password=scan.next();
		
		if(username.equalsIgnoreCase(validUsername) && password.equals(validPassword)){
			System.out.println("Login Succesful, Welcome!");
		}else if(!username.equalsIgnoreCase(validUsername)&& !password.equals(validPassword)) {
			System.out.println("Invalid username and invalid password");
		}else if(username.equalsIgnoreCase(validUsername) &&!password.equals(validPassword)) {
			System.out.println("Invalid password");
		}else if(!username.equalsIgnoreCase(validUsername)&& password.equals(validPassword)) {
			System.out.println("Invalid username");
	
		}
	
	}

}
