package day41_customClasses_methods02;

public class MyCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomClassCar car1= new CustomClassCar();
		
		car1.make="Ford";
		car1.model="Fiesta";
		car1.color="Grey";
		car1.currentSpeed=55;
		car1.printCarInfo();
		
		car1.ShowCurrentSpeed(38);
		car1.drive();
		car1.accellerate(20);
		System.out.println(car1.currentSpeed);
		
		BMW car=new BMW();
		System.out.println(car.make);
		car.model="740i";
		car.showPrice();
		System.out.println(car.price);
		
		BMW bmw2 =new BMW();
		bmw2.model="X3";
		bmw2.showPrice();
	}

}
