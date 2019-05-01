package day26_Arrays04;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words = "java,kava,html,selenium";

		String[] web = words.split(",");

		System.out.println(Arrays.toString(web));

		for (String word : web) {
			System.out.println(word);
		}
	

	String directResult = "1 - 20 of 1,371 positions";

	String[] sp = directResult.split(" ");
	System.out.println("Search result total:  "+sp[4]);
	
	
	String[]dice=directResult.split(" of ");
	System.out.println(dice[0]);
	System.out.println(dice[1]);
	
	
	String sentence="I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy."; 
	String []allWord=sentence.split(" " );
	String[]happy=sentence.split("happy" );
	String i[]=sentence.split("I");
	for(String w:allWord) {
		System.out.println(w);
	}
	for(String h:happy) {
	System.out.println(h);
	}
	for(String isplit:i) {
	System.out.println(isplit);
	
	}
	
	
	String word="java";
	char[]charsArray= word.toCharArray();
	
	
	for(char ch:charsArray) {
		System.out.println(ch);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}