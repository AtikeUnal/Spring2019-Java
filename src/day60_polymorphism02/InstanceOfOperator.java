package day60_polymorphism02;

import day59_polymorphism.*;
//import day59_polymorphism.Square;
//import day59_polymorphism.Triangle;

public class InstanceOfOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Shape shape =new Square();
		
		//get class method
		
		System.out.println(shape.getClass().getName());
		
		System.out.println(shape.getClass().getSimpleName());
		
		
		if(shape.getClass().getSimpleName().equals("Triangle")) {
			System.out.println("It is a triangle");
		}else if(shape.getClass().getSimpleName().equals("Circle")) {
			System.out.println("It is a circle");
			
		}else if(shape.getClass().getSimpleName().equals("Square")) {
			System.out.println("It is square");
		}
	
		
		
		//same check with instanceof opeator
		System.out.println(shape instanceof Square);
		System.out.println(shape instanceof Circle);
		System.out.println(shape instanceof Triangle);
		
		System.out.println(shape instanceof Shape);
		System.out.println(shape instanceof Object);
	
		
		
		if(shape instanceof Triangle) {
			System.out.println("It is a triangle!");
			shape.draw();
		}else if(shape instanceof Circle) {
			System.out.println("It is a circle!");
			shape.draw();
		}
		else if(shape instanceof Square) {
			System.out.println("It is square!");
			shape.draw();
		}
	
		
		
		Shape[] shapes = { new Triangle(), new Square(), new Circle(), new Triangle(), new Square(), new Circle() };
		
		int circles = 0, squares=0,triangles=0;
		
		//using for each loop to find our number of each type
		
		System.out.println("for each instance of");
		
		for(Shape s:shapes) {
			
			if(s instanceof Triangle) {
				triangles++;
			}
			else if(s instanceof Circle) {
				circles++;
			}else if(s instanceof Square) {
				squares++;
			}
		}
		
		
		
		
		
		System.out.println("circles: "+circles+"triangle: "+triangles+"Square: "+squares);
	}
	
	

}
