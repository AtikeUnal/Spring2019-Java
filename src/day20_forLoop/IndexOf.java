package day20_forLoop;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "amazon";
		char letter = 'n';
		word=word.toLowerCase();
		// System.out.println(word.indexOf(letter));
		int index = -1;
		// break; exit for loop.

		for (int i = 0; i <= word.length(); i++) {

			if (word.charAt(i) == letter) {
				index = i;
				break;
			}
		}
		System.out.println("Index: " + index);

	}

}
