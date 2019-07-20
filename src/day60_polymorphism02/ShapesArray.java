package day60_polymorphism02;

//
//import day59_polymorphism.Shape;
//import day59_polymorphism.Triangle;
import day59_polymorphism.*;
import java.util.*;

public class ShapesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Triangle();
		shape.draw(); // overriden version if no overriden goes to Parent class

		Shape[] shapes = { new Triangle(), new Square(), new Circle(), new Triangle(), new Square(), new Circle() };

		Shape[] shape2 = new Shape[3];

		shape2[0] = new Triangle();
		shape2[1] = new Square();
		shape2[2] = new Circle();

		shapes[0].draw();
		shape2[2].draw();

		System.out.println("######## FOR EACH LOOP");

		for (Shape sh : shapes) {
			System.out.println(sh.getClass().getSimpleName());
			sh.draw();

		}

		// create a list of Shapes aand add 5 different child objects

		List<Shape> shapeList = new ArrayList<>();
		shapeList.add(new Triangle());
		shapeList.add(new Circle());
		shapeList.add(new Square());
		shapeList.add(new Circle());
		shapeList.add(new Square());
		shapeList.add(new Triangle());
		shapeList.add(new Circle());

		System.out.println("######ARRAYLIST#############");
		shapeList.get(0).draw();
		shapeList.get(2).draw();

		System.out.println("########FOR EACH LOOP With list of SHAPES");

		for (Shape eachlist : shapeList) {
			System.out.println(eachlist.getClass().getSimpleName().toUpperCase());
			eachlist.draw();
		}

		System.out.println("FOR LOOP");

		for (int i = 0; i < shapeList.size(); i++) {
			shapeList.get(i).draw();
		}
						// to know which class it is in use .getClass().getName();
						//getClass().getSimpleName();
		//Animal an =new Koala();
		
	
		//if(an)
	}

}
