package day14_String_methods;

public class StringSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Good Morning";
		// check if it matches Good Morning and print match or not match
		// convert to all uppercase

		if (str1.equals("Good Morning")) {
			System.out.println("Match");
		} else {
			System.out.println("Not Match");
		}

		if (str1.equalsIgnoreCase("good morning")) {
			System.out.println("match-ignore case");
		} else {
			System.out.println("not match-ignor case");
		}

		System.out.println(str1.toUpperCase());
		System.out.println(str1);

		str1 = str1.toUpperCase();
		System.out.println(" After asignment: " + str1);

		if (str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");

		} else {
			System.out.println("Chained methods: do not match");
		}

		String myName = "Atike";

		System.out.println(myName.length());

		int lenght = myName.length();
		System.out.println("My name's lenght: " + lenght);

		String username = "Atikeuna";
		if (username.length() == 8) {
			System.out.println("valid username");
		} else {
			System.out.println("invalid username must be 8 chars");
		}

		String password = "123abcdefg";

		if (password.length() >= 6) {
			System.out.println("correct");
		} else {
			System.out.println("incorrect");

		}
		int passwordLenght = password.length();

		if (passwordLenght < 6) {
			System.out.println("Invalid password too short");
		} else {
			System.out.println("Valid password good job");
		}

	}

}
