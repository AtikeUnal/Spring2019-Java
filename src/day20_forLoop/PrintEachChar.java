package day20_forLoop;

public class PrintEachChar {

	public static void main(String[] args) {
		String word = "AtikeVEdatESatAhmet";
		// using for loop print each char one by one

		// using for loop print only constants
		// using for loop print vowel(a,e,o,i,u)

		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		for (int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if (letter == 'a' || letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u') {
				System.out.print(letter + ",");

			}

		}
		System.out.println();
		for (int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if (!(letter == 'a' || letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u')) {
				System.out.print(letter + ",");
			}
		}
	}

}
