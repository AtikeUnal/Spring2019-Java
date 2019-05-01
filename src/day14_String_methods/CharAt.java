package day14_String_methods;

import java.util.*;

public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String word = "Computer";
		System.out.println(word.length());
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));

		String word2 = "java";

		if (word2.charAt(0) == 'J') {
			System.out.println("J is first char");
		} else {
			System.out.println("J is not first char");
		}

		String word3 = "Atike";
		if (word3.charAt(0) == word3.charAt(4)) {
			System.out.println("first and last match");
		} else {
			System.out.println("first and last are different");
		}

		char first = word3.charAt(0);
		char last = word3.charAt(4);
		if (first == last) {
			System.out.println("first and last match");
		} else {
			System.out.println("first and last are different");
		}

		String word4 = "java";
		char lastChar = word4.charAt(word4.length() - 1);
		System.out.println("Last char of " + word4 + " is " + lastChar);

	}

}
