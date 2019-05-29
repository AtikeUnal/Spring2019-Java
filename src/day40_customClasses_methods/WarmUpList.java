package day40_customClasses_methods;

import java.util.ArrayList;

public class WarmUpList {
	public static void main(String[] args) {
		
	ArrayList<String>str=new ArrayList<>();		
		
		str.add("Moon");
		str.add("Sun");
		str.add("Mars");
		str.add("Saturn");
		str.add("Sun");
		str.add("Sun");
		str.add("Jupiter");
		str.add("Sun");
		
		String targetword= "Sun";
		int count= countOccurances(str,targetword);
		if(count==3) {
		System.out.println("Unit test PASS count:3");
	}else {
		System.out.println("Unit test Failed");
		System.out.println("expected: 3");
		System.out.println("Actual: "+count);
	}
	}
	
	public static int countOccurances(ArrayList <String> strArr , String word) {

		//method counts how many times, word appears in the list, and returns the count
		
		
		
		int count=0;
		    for(String str:strArr) {
			if(str.equals(word)) {
				count++;
			}
		}
		
	return count;	
		
		
	}

}
