package day59_polymorphism;

public class AnimalShow {
public static void main(String[] args) {
	
	
	Animal a =new Animal();
	
	//polymorphic way
	
	Animal tiger=new Tiger();
	Animal cheetah =new Cheetah();
	Animal someanimal =new Zebra();
	
	a.talk();
	tiger.talk();
	cheetah.talk();
	someanimal.talk();
	
}
}