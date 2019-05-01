package day15_String_manipulation;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		             // 012345
		String word1 = "github";
		System.out.println(word1.indexOf('g'));
		System.out.println(word1.indexOf("thu"));
		System.out.println(word1.indexOf("hub"));
		System.out.println(word1.indexOf("at"));

		String url = "www.okta.com";
		int i = url.indexOf(".");
		System.out.println("Pos of . :" + i);
		System.out.println(url.charAt(i + 1));

		String title = "Java - Google Search";

		int dash = title.indexOf("-");
		System.out.println(dash);
		System.out.println(title.charAt(dash + 1));
		System.out.println(title.charAt(dash - 1));

		String country = "United States of America";
		int states = country.indexOf("States");
		System.out.println("position of States: " + states);
		String word2 = "java, c+, python, tomcat, eclipse";

		if (word2.contains("c++")) {
			System.out.println("C++ is there");
		} else {
			System.out.println("C++ is not there");
		}

		if (word2.indexOf("c++") > -1) { // it means it is not there
			System.out.println("C++ is there");
		} else {
			System.out.println("c++ is not there");
		}

	}

}
