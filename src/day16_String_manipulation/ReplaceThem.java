package day16_String_manipulation;

public class ReplaceThem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Coding is fun, it is my hobby!!";
		String withNoSpace = sentence.replace(" ", "");
		System.out.println(sentence);
		System.out.println(withNoSpace);

		sentence = sentence.replace(",", "!!!");
		System.out.println(sentence);

		String mixed = "&^@#j$a-v|a@#$";

		mixed = mixed.replace("&^@#", "");
		System.out.println(mixed);
		mixed = mixed.replace("@#$", "");
		System.out.println(mixed);
		mixed = mixed.replace("$", "").replace("-", "").replace("|", "");
		System.out.println(mixed);

		mixed = mixed.replace("a", "");
		System.out.println(mixed);

		String result = "About 115,000,000 results (0.59 seconds)";

		result = result.replace("About ", "");
		System.out.println(result);
//result=result.replace(" results (0.59 seconds)", "");

		result = result.substring(0, result.indexOf(" "));

		System.out.println(result);

		result = result.replace(",4", "");

		System.out.println(result);

	}

}
