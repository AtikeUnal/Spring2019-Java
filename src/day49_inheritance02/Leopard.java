package day49_inheritance02;

public class Leopard extends Animal {

	
	
	public Leopard() {
		
		super();  //animal class constructor
		System.out.println("Leopard constructor");
		setType("Leopard");
		
	
	}
	public Leopard(String type) {
	
		super(type); //call Animal(String type)
		
		System.out.println("Leopard one-arg constructor");
		
	}
}
