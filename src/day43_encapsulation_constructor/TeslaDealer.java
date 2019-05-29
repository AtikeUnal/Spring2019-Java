package day43_encapsulation_constructor;
import java.util.*;
public class TeslaDealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Tesla myCar1=new Tesla();
		
		myCar1.setModel("Roadster");
		myCar1.setRange(620);
		myCar1.setPrice(200.00);
		myCar1.setZeroTo60(1.9);
		myCar1.setSelfDriving(true);
		
		System.out.println("Model: "+myCar1.getModel());
		System.out.println("Range: "+myCar1.getRange());
		System.out.println("Acceleration 0-60 mph "+myCar1.getZeroTo60());
		System.out.println("Price: "+myCar1.getPrice());
		System.out.println("Is Self Driving? "+myCar1.isSelfDriving());
		
		
		System.out.println(myCar1);
		System.out.println(myCar1.toString());
		
		
		
		Tesla myTesla =new Tesla();
		myTesla.setTeslaInfo("Model Y", 310, 3.2, 51450.0, true );
		System.out.println(myTesla.toString());
				
		
		
		if(myCar1.getZeroTo60()> myTesla.getZeroTo60()) {
			System.out.println("Faster model "+myTesla);
		}else {
			System.out.println("Faster model: " + myCar1.getModel());
			System.out.println("0-60 speed: " + myCar1.getZeroTo60());
		}
		

		
		//buy Tesla
		
		buy(myCar1);
		buy(myTesla);
		testDrive("Model S");
		Tesla testCar= testDrive("Model 3");
		System.out.println(testCar);
		
	}  //main method
	
	
	
	public static void buy(Tesla car) {
		System.out.println("Purchasing "+ car.toString());
	}
	
	public static Tesla testDrive(String model) {
		
		 Tesla car =new Tesla();
		 car.setTeslaInfo(model, 340, 1.3, 34.500, false);
				System.out.println("I would like to test drive "+model);
				System.out.println("Sure let me build the object and return it ");
				
				return car;
	}
	
}
