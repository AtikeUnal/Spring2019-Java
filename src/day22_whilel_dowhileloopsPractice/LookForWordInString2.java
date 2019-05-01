package day22_whilel_dowhileloopsPractice;

public class LookForWordInString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String sentence= "He said hi, then she replied hi. hi guys!";
		
		
		int count=0;
		for(int i=0;i<=sentence.length()-2;i++) {
			String temp=sentence.substring(i,i+2);
			//System.out.println(temp);
			
			
			if(temp.equals("hi")) {
				count++;
				System.out.println(temp);
			}
		}
		
		
		
		
		
		
		
	}

}
