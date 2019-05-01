package day30_method02;

public class StudentMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		study("Selenium");
		sleep(10);
		
		

	}

	public static void study(String topic) {
		System.out.println("Student is studying "+topic);
		
		//study("java");
		
		
	}
	
	public static void sleep(int hours) {
		System.out.println("Student has been sleeping for "+hours+" hours.");
	}
	
}
