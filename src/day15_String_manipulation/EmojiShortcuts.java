package day15_String_manipulation;

import java.util.*;

public class EmojiShortcuts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String emoji = ":)";

		char firstEmoji = emoji.charAt(0);
		char secondEmoji = emoji.charAt(1);

		if (emoji.length() != 2) {
			System.out.println("invaid emoji");
			return;
		}

		if (firstEmoji == ':') {
			if (secondEmoji == ')') {
				System.out.println("smile");
			} else if (secondEmoji == '(') {
				System.out.println("sad");
			} else if (secondEmoji == '/') {
				System.out.println("upset");
			} else if (secondEmoji == 'p') {
				System.out.println("playful");
			} else {
				System.out.println("unknown emoji");
			}
		} else if (firstEmoji == ';') {
			if (secondEmoji == ')') {
				System.out.println("wink");
			} else if (secondEmoji == 'o') {
				System.out.println("surprised");

			} else {
				System.out.println("unknown emoji");
			}
		} else if (firstEmoji == ')') {
			if (secondEmoji == ':') {
				System.out.println("sad");
			} else {
				System.out.println("unknown emoji");
			}
		} else {
			System.out.println("Invalid emoji");
		}

	}

}
