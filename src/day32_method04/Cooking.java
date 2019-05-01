package day32_method04;

public class Cooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add("oil");
		add("pasta");
		add("salt");
		mix(5);
		fry(2);
		boil(7);
		makePancakes();
		makePasta();
		cook("Omlet","Egg,salt,greenpapers,tomatoes");
		
	}
	public static void cook(String dish,String ingredients) {
		
		System.out.println("~~"+ dish.toUpperCase()+" RECIPE~~");
		add(ingredients);
		System.out.println("Cook it until it is cooked");
		System.out.println("~~");
		System.out.println("~~"+dish.toUpperCase()+" IS READY~~");
		if(dish.equals("pancakes")) {
			makePancakes();
		}
	}
	public static void makePasta() {
		System.out.println("~~Italian Pasta Recipie~~");
		add("water,oil,salt,");
		boil(2);
		add("pasta spagetti");
		boil(7);
		mix(60);
		add("parmesan cheese, marinara");
		System.out.println("~~Delicious pasta is ready~~");
		
			
		
	}
	
	public static void makePancakes() {
		System.out.println("~~Pancakes Recipie~~");
		add("Milk,eggs,flour,sugar salt");
		mix(120);
		fry(3);
		System.out.println("~~Enjoy your Pancake~~");
	}

	public static void add(String something) {

		System.out.println("Add " + something);

	}

	public static void mix(int seconds) {
		System.out.println("Mix for " + seconds + " seconds");
	}

	public static void fry(int minutes) {
		System.out.println("Fry for " + minutes + " minutes");
	}

	public static void boil(int min) {
		System.out.println("Boil for " + min + " minutes");
	}

}
