package day14_String_methods;

import java.util.*;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter two words");
		String word1 = scan.next();
		String word2 = scan.next();

		if (word1.length() > word2.length()) {
			System.out.println(word1 + " is longer");

		} else if (word2.length() > word1.length()) {
			System.out.println(word2 + " is longer");
		} else {
			System.out.println(word1 + " and " + word2 + " are same lenght");
		}

	}

}
