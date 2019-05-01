package day31_method03;

public class Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*name: login
		username password

		*/
		login("mentoring@cybertekschool.com","mentor001" );

	}

	public static void login(String username, String password) {
		
		
		String validUsername= "mentoring@cybertekschool.com";
		String validPassword= "mentor001";
		
		
		if(username.equalsIgnoreCase(validUsername)&&password.equals(validPassword)) {
			System.out.println("Login Successful! Welcome to Okta");
		}else {
			System.out.println("Sign in failed");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
}
