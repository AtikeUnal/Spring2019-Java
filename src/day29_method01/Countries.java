package day29_method01;

import java.util.Arrays;

public class Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [][]countries={{"USA","Washington DC"},//0
								{"Canada","Ottawa"},//1
								{"Mexico","Mexico city"},//2
								{"Brasil","Brasilia"},//3
								{"Peru","Lima"},//4
								{"Argentina","Boanes Aeros"},//5
								{"Bolivia","La Paz"},//6
								{"Macedonia","Scopia"},//7
								{"Kazakhstan","Nursultan"}//8
									};
	
	
	//String [][]c=new String[9][2];
	System.out.println(countries[0][0]+"|"+countries[0][1]);
	System.out.println(countries[8][0]+"|"+countries[8][1]);
	
	
	System.out.println(Arrays.deepToString(countries));
	
	
	for(int i=0;i<countries.length;i++) {
		System.out.print(countries[i][0]+" | ");
	}
	System.out.println();
	
	for(String[]countryArray:countries) {
		System.out.print(countryArray[0]+"|");
		System.out.print(countryArray[1]+"|");
	}
	System.out.println();
	//get all the cities and add to cities array
	
	String[]cities=new String[countries.length];
	
	System.out.println(Arrays.toString(cities));
	
	for(int i=0;i<cities.length;i++) {
		cities[i]=countries[i][1];
	}
	System.out.println(Arrays.toString(cities));
	
	
	
	for(int i=0;i<countries.length;i++) {
		
		if(countries[i][0].equals("Bolivia")) {
		//System.out.println(countries[i][1]);	
			if(countries[i][1].equals("La Paz")) {
			System.out.println("Bolivia test  passed");
		}else {
			System.out.println("Bolivia test  failed");
		}
		break;
	}
	}
	
}
}