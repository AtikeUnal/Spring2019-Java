package day22_whilel_dowhileloopsPractice;

public class FindHowManyUsingReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word= "including webpages, images";
		//find how many e chars in the word
		//get the length of word
		//replace all e with empty
		//get the length of word without e
		//do a minus
		
		int length1=word.length();
		word = word.replace("e", "");
		int length2= word.length();
		System.out.println("length1: "+length1);
		System.out.println("length2: "+length2);
		
		
		int count = length1-length2;
		System.out.println("Count of e: "+count);
		
		
		
		
		
		
		
		
		
		
		
	}

}
