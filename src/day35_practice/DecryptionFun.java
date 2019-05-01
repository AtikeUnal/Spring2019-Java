package day35_practice;

public class DecryptionFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(decryptWord("zsnvg"));
		System.out.println(decryptSentence("qzez rh ufm"));
	}	
		
	public static char decryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		int i = encrypted.indexOf(ch);
		char ret =  alphabet.charAt(i);
		return ret;
	}

	public static String decryptWord(String word) {
		String converted = "";
		for (int i = 0; i < word.length(); i++) {
			converted += decryptChar(word.charAt(i));
		}
		return converted;		
	}

	public static String decryptSentence(String sentence) {
		String[] wordsArr = sentence.toLowerCase().split(" ");
		String retValue = "";
		for(String word : wordsArr) {
			retValue += decryptWord(word)+" ";
		}
		return retValue.trim();
	}
					
}