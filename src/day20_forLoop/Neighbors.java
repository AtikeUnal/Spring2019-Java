package day20_forLoop;

import java.util.*;

public class Neighbors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a word");
		String word = scan.next();
		// aabcdd

		for (int i = 0; i < word.length() - 1; i++) {

			if (word.charAt(i) == word.charAt(i + 1)) {
				System.out.println("Beep- " + word.charAt(i));
			}
		}

	}

}
