package day42_customClasses_encapsulation;

public class WarmUp_Starbucks {
//data
	String name;
	String size;
	double price;
	int calories;
	
	
	public void getCoffeInfo() {
		//Behavior
		System.out.println(name.toUpperCase()+" "+size.toUpperCase()+"  $"+price+"  "+calories+"CAL");
	}	
	public void setName(String newName) {
		//setter method
		name=newName;		
					
	}	
	public void setSize(String newSize) {
		//setter method
		
		if(newSize.equalsIgnoreCase("TALL")||newSize.equalsIgnoreCase("grande")||newSize.equalsIgnoreCase("veti")) {
		
		size=newSize;	
		
		}else {
			System.out.println("ERROR: Invalid Size- "+newSize);
			size="unknown";
		}				
	}
	
	public void setPrice(double newPrice) {
		//SETTER Methods 
		price=newPrice;	
			
			
	}
	
	public void setCalories(int newCal) {
		
	calories=newCal;
					
	}
	public void setCoffeeInfo(String newName, String newSize ,double newPrice, int newCal ) {
		
		name=newName;
		setSize(newSize);
		price=newPrice;
		calories=newCal;
	}
}
