package day21_whilel_dowhileloopsRew;

public class StringUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "javva";
		// 01234

		String unique = "";

		char ch = word.charAt(0);
		// System.out.println(unique.contains(""+ch));
		if (!unique.contains("" + ch)) { // if(unique.indexOf(ch)==-1)
			unique += ch;
		}
		System.out.println("Unique: " + unique);

		String word2 = "bananas";
		String unique2 = "";
		int i = 0;
		char ch2 = word2.charAt(i);
		System.out.println("Ch2 "+ch2);
		i++;
		if(unique.contains(""+ch2)) {   //whole thing will be string  String str = new String (ch);
			
		}
		
		
		
		
		
		
		
	}

}
