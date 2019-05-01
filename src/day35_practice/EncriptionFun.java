package day35_practice;

public class EncriptionFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";

		String words= "ahmet";
		
		char first=words.charAt(0);
			
			int position = alphabet.indexOf(first);
		System.out.println("Position: "+position);
		char enChar= encrypted.charAt(position);
		
		System.out.println(first+"--->"+enChar);
		
		String encryptedWord="";
		for(int i =0;i<words.length();i++) {
			char ch=words.charAt(i);
			
			int index= alphabet.indexOf(ch);
			System.out.print(encrypted.charAt(index));
			encryptedWord+=encrypted.charAt(index);
			
		}
	System.out.println();
	System.out.print(encryptedWord);
	System.out.println();
	
System.out.println(encrypted('z'));
System.out.println(encrypted('o'));

String normal="sunday";
System.out.println(encryptWord(normal));



System.out.println(encryptSentence("I"));
System.out.println(encryptSentence("Hello world"));
}
	
	
	public static char encrypted(char ch) {
		
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
	//return 	encrypted.charAt(alphabet.indexOf(ch));
	
	
		
	int i = alphabet.indexOf(ch);
	char ret = encrypted.charAt(i);
	return ret;
		
		
}	
	
	
	
	

	public static String encryptWord(String word) {
		String cyphered = "";
		for (int i = 0; i < word.length(); i++) {
			cyphered += encrypted(word.charAt(i));
		}
		return cyphered;		
	}
	
	
	
	/*
	 * encryptSentence
	 * return type: String
	 * param: String sentence
	 * Split the sentence by space and call encryptWord and 
	 * return encrypted sentence
	 */
	
	
	public static String encryptSentence(String word) {
		
		String[] newStr=word.split(" ");
		String retVal="";
		
		for(String str:newStr) {
			retVal+=encryptWord(str)+" ";
		}
		
		return retVal.trim();
	}
	
	
}