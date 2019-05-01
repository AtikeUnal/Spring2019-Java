package day16_String_manipulation;

public class IsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username = "";
		String password = "";

		System.out.println(username.isEmpty());

		if (username.isEmpty()) {
			System.out.println("Username cannot be empty");
		} else {
			System.out.println("Username is not empty");
		}

		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("Username and password cannot be empty");
		} else {
			System.out.println("Username and password are not empty");
		}
		if(username.length()==0) {
			System.out.println("it is empty");
			
			
			
			
			
			
		}
	}

}
