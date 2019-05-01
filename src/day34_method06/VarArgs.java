package day34_method06;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		// public static void main(String... args){

		
		printWords("red","blue","pink","white");
		printWords();
		printWords("gray");
		System.out.println(sum(3,4,5));
		
		String myFarm[]= {"cat","horse","sheep","goat"};
		
		printWords(myFarm);
		
		System.out.println(sum(3, 5 , 10));
		System.out.println(sum(87564, 545, 879844, 55,33232,54545432,2344,2345,533,1234,523));
		int budget = 200;
		if(sum(10, 45, 110, 30) <= budget) {
			System.out.println("Within budget");
		}else {
			System.out.println("Broke");
		}
	
	int total=sum(234,43,567,12,34,5);
	System.out.println("total: "+total);
	
	cook("Buritto Bowl","Rice", "Beans","Meat","Sour Cream");
	cook("Avacado Toast","Avacado","Sunny side egg","bread");
	
	shoppingList(1000,"Swatch watch","DKNY BAG","Shoes");
	
		
	}
public static void printWords(String... words) {
	
	
	
	for(String w: words) {
	System.out.println(w);
	
	
}}
public static int sum(int...sumNum) {
	
	
	int sum=0;
	for(int i:sumNum) {
	sum+=i;
	
}
return sum;	


}

public static void cook (String name, String... ings) {
	System.out.println("Food: "+name);
	System.out.println(Arrays.toString(ings));
}


public static void shoppingList(int prices, String... names) {
	System.out.print("Total cost: " + prices);
	System.out.println(Arrays.toString(names));
}




}
