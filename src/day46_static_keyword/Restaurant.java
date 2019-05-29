package day46_static_keyword;

public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dinner mom=new Dinner();
		Dinner kid1= new Dinner();
		Dinner dad= new Dinner();
		Dinner kid2= new Dinner();

		System.out.println("Total slices: "+ Dinner.pizzaSlices);
		
		dad.takeASlice();
		kid1.takeASlice();
		mom.takeASlice();
		
		
		System.out.println("Total slices: "+ Dinner.pizzaSlices);

		System.out.println("total slices: "+dad.pizzaSlices);
		kid2.takeASlice();
		
		System.out.println("Total slices: "+ Dinner.pizzaSlices);
		
		dad.takeASlice(2);
		System.out.println("Total slices: "+ Dinner.pizzaSlices);
		mom.takeASlice(2);
		System.out.println("Total slices: "+ mom.pizzaSlices);
	}

}
