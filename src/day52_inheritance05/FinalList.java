package day52_inheritance05;

import java.util.ArrayList;

public class FinalList {

	public static void main(String[] args) {
		
	
	ArrayList <String> COLORS =new ArrayList<>();
	COLORS.add("Orange");
	COLORS.add("Gray");
	COLORS.add("Blue");
	
	
	System.out.println(COLORS);
	COLORS.add("Black");
	System.out.println(COLORS);
	
	
	
	COLORS.remove("Gray");
	
	
	
	}
	
	
	
}
