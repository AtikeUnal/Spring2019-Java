package day41_customClasses_methods02;

public class Kitchen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Microwave mic=new Microwave();
		
		mic.brand="LG";
		mic.turnOn();
		mic.heat("Pizza with mushrooms");
		mic.turnOff();
	}

}
