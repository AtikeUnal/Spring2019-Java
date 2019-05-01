package day16_String_manipulation;

public class CapitalCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="Moscow is a capital of Russia";
		
		str=str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
		System.out.println(str);
		
		String email="firstName_lastName@gmail.com";
		
		String company ="deloitte";
		email=email.replace("gmail", company);
		System.out.println(email);
		
		
		
		
	}

}
