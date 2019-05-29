package day47_blocks;

import java.time.LocalDateTime;


public class BriteERP {

	
	static { //automaticly runns when we call methods
		
		System.out.println("Launch Browser");
		System.out.println("Navigate to:  "+TestData.url);
		
		
	}
	public static void enterEmail() {
		System.out.println("Enter e-mail:  "+TestData.email);
	}
	
	public static void enterPassWord() {
		System.out.println("Enter password:  "+TestData.password);
	}
	
	public static void verifyLogin() {
		
		System.out.println("Expected result: "+TestData.userName);
		System.out.println("Actual name displayed : Viktoriia Lugovska");
		System.out.println("Login Succesful - "+ LocalDateTime.now());
		
	}
}
