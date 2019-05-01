package day16_String_manipulation;

import java.util.*;

public class Url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter url:");
		Scanner scan = new Scanner(System.in);
		String url = scan.next();

		String extention = "";
		// www.amazon.com
		// com net edu org gov

		if (url.startsWith("www.")) {
			System.out.println("www. is present");
		} else {
			System.out.println("invalid url format");
			return;
		}
		int dotIndex = url.length() - 4;

		if (url.charAt(dotIndex) == '.') {
			System.out.println(" . is there before extension");
		} else {
			System.out.println(". might be misplaced");
		}
		// url.charAt(url.length()-4)=='.')
		String domain = url.substring(4, dotIndex);
		System.out.println("Domain: " + domain);

		String extension = url.substring(dotIndex + 1, url.length());

		System.out.println("Extension: " + extension);

	}

}
