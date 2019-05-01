package day15_String_manipulation;

public class Contains {
	public static void main(String[] args) {

		String email = "test@gmail.com";
		System.out.println(email.contains("@"));

		String list = "potatos, apples, tomatoes, eggs, milk, bread,cereal, meat";

		// check if apples is in the shopping list

		if (list.contains("apples")) {
			System.out.println("Apples are there!");
		} else {
			System.out.println("Lets add apples now!");
		}

		boolean hasEggs = list.contains("eggs");// case senstive

		System.out.println("Contains eggs: " + hasEggs);

		boolean hasCucember = list.contains("cucumer");
		System.out.println("Contains cucambers: " + hasCucember);

		email = "name@yahoo.com";

		if (email.contains("@yahoo")) {
			System.out.println("Yahoo account");
		} else if (email.contains("@gmail")) {
			System.out.println("Gmail account");
		} else if (email.contains("@hotmail")) {
			System.out.println("Hotmail account");
		}

		String etsyTitle = "Wooden spoon | Etsy";
		if (etsyTitle.contains(" | ")) {
			System.out.println("pipe there");
		}

		String name = "atike";

		if (name.contains("a") || name.contains("e")) {
			System.out.println("'a' or 'e' is there");
		} else {
			System.out.println("'a' or 'e' is not there");
		}

	}
}
