package day59_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HairSpray hp =new HairSpray();
		hp.catchFire();
		
		Flammable hairsp =new HairSpray();
		hairsp.catchFire();
		
		Flammable pTank =new PropaneTank();
		pTank.catchFire();
		
		
//		Flammable item;
//		List <Flammable>items =new ArrayList<>();
//		
	
	}

}
