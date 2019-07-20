package day57_interface;

public class InterfaceTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tesla t=new Tesla();
BMWi8 i8= new BMWi8();



t.charge();
i8.charge();

t.drive();
t.selfDrive();


	Electric el2=new Tesla(); //this is polymorphisim
	
	Cat ct =new Cat();
	ct.keepAsPet();
	ct.play();
	Pet.feed("Fish");
	}

}
