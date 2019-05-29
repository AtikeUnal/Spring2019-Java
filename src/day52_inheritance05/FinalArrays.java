package day52_inheritance05;

import java.util.Arrays;

public class FinalArrays {

	
	
	public static void main(String[] args) {
		
		
		
		
		final int []TEAMS= {11,11};
		System.out.println("Team1: "+TEAMS[0]);
		System.out.println("Team2: "+TEAMS[1]);
		
		TEAMS[0]=10;
		TEAMS[1]=9;
		
		System.out.println("Team1: "+TEAMS[0]);
		System.out.println("Team2: "+TEAMS[1]);
		
		
		//TEAMS= new int [3]; you cannot say that because it is final.
		
		final int[] nums =new int [] {23,3,55,678};
		//nums=new int [] {65,778,544,3};
		
		final double [] PRICES=new double[3];
		PRICES[0]=85.5;
		PRICES[1]=21.3;
		PRICES[2]=99.7;
		System.out.println(Arrays.toString(PRICES));
		PRICES[0]=80.1;
		
		System.out.println(Arrays.toString(PRICES));

	}
	
	
}
