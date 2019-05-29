package day46_static_keyword;

public class Vehicle {

	
	
	String type; //instance variable every object has its own type
	static int numberOfVehicles;  //share one central value
	
	
	public static void vehicleInfo() {
		//System.out.println("type: "+type);   it will not work. 
		System.out.println("type: "+numberOfVehicles);
		String make="Kia";
		make =make.toUpperCase();
		System.out.println("make: "+make);
	}
		public static int getNumberOfVehicles() {
	
			return numberOfVehicles;
		
		}
	
		
	public String toString() {
		
		return "Vehicle type: " +type+" | "+"numberOfVehicles: " +numberOfVehicles;
	}	
		
	
	
		
		
		
		
		
}
