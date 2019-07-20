package day55_Abstraction;

public class SailBoat extends Vehicle{

	
	private int length;
	
	
	public SailBoat(int wheels, double price, int length ) {
		
		
		super(wheels, price, "SailBoat", "wind");
		this.length=length;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
	System.out.println("Sails....");
		
	}

	public int getLength() {
		return length;
	}

	
	
	
	
}
