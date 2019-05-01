package day22_whilel_dowhileloopsPractice;

public class SubstringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word="java";
		
		
		//System.out.println(word.substring(0, 2));//ja
		
		System.out.println(word.substring(0,1));
		System.out.println(word.substring(1, 2));
		System.out.println(word.substring(2, 3));
		System.out.println(word.substring(3));
		
		System.out.println("################");
		int i=0;
		
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		i++;
		
		
		System.out.println();
		
		for(int n=0;n<=3;n++) {
			System.out.println(word.substring(n,n+1));
		}	
			System.out.println("_______________________");
			for(int m=3;m>=0;m--) {
				System.out.println(word.substring(m,m+1));
				
			}	
	
			
			
			
			
			
			
			
			
	}
	
		
	}


