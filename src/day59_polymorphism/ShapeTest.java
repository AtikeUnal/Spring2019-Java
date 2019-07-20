package day59_polymorphism;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Shape shape1 =new Shape();
		shape1.draw();
		
		Shape circle =new Circle();
		circle.draw();
		
		Shape square= new Square();
		square.draw();
		
		Shape triangle = new Triangle();
		triangle.draw();
	}

}
