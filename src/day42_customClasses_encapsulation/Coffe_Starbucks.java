package day42_customClasses_encapsulation;

public class Coffe_Starbucks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WarmUp_Starbucks coffee= new WarmUp_Starbucks();
		
		coffee.name= "Caffe Latte";
		coffee.size="Tall";
		coffee.price=3.25;
		coffee.calories=150;
		
		coffee.getCoffeInfo();
		
		
		WarmUp_Starbucks coffee2= new WarmUp_Starbucks();
		
		
		coffee2.setName("JAVA CHIP");
		coffee2.size="Venti";
		coffee2.price=5.95;
		coffee2.calories=600;
	
		coffee2.getCoffeInfo();
		
		
		WarmUp_Starbucks coffee3= new WarmUp_Starbucks();
		
		coffee3.setName("Iced coffe");
		coffee3.setSize("Tall");
		coffee3.setPrice(2.45);
		coffee3.setCalories(60);
		
		coffee3.getCoffeInfo();
		
		WarmUp_Starbucks coffee4= new WarmUp_Starbucks();
		
		
		coffee4.setCoffeeInfo("Flat White", "Tall", 3.95, 170);
		coffee4.getCoffeInfo();
	}

}
