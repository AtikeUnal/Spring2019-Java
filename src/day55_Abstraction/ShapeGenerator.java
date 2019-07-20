package day55_Abstraction;

public class ShapeGenerator {
public static void main(String[] args) {
	
	
	Circle cr1=new Circle(10);
	System.out.println("Area; "+cr1.calculateArea());
	cr1.draw();
	
	Triangle tr1=new Triangle(5,5,5);
	System.out.println("Area: "+tr1.calculateArea());
	tr1.draw();
	
}
}
