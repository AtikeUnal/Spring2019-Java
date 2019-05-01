package day04_primatives_operators;

public class UsingVariables {
public static void main(String[] args) {
	int num1, num2, num3;
	 num1= 100;
		num2= num1;
		System.out.println(num1);
	 System.out.println(num2);
	 num2=200;
	 num1=num2;
	 num3=num1;
	 System.out.println(num1);
	 System.out.println(num2);
	 System.out.println(num3);
	//declare apples and assisgn 25
	 int apples= 25;
			 
	 //declare kiwis and assign values of apples to it
			int  kiwis= apples;
	 //declare mangoes and 55
			int mangoes= 55;
	 //assign value of mangoes to kiwis
			 kiwis=mangoes;
			 System.out.println(apples);//25
			 System.out.println(kiwis);//55
			 System.out.println(mangoes);//55
}
}
