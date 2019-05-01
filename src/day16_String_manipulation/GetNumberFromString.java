package day16_String_manipulation;

public class GetNumberFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "I wrote [21] lines of code today";

		int Start = sentence.indexOf('[') + 1;
		int end = sentence.indexOf(']');

		String num = sentence.substring(Start, end);
		System.out.println("Lines of code: " + num);

		System.out.println("Lines of code: " + sentence.substring(sentence.indexOf('[') + 1, sentence.indexOf(']')));
		// check if num is more than 20

		int count = Integer.parseInt(num);

		if (count > 20) {
			System.out.println("Wrote more than 20 lines of code Today!!");
		} else {
			System.out.println("Not enough coding for today");
		}

		String word = "coffe cup";
		word.substring(7); // take till the end

	}

}
