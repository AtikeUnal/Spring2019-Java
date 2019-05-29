package day52_inheritance05;

public class EqualsMethod {

	
	
	
	public static void main(String[] args) {
		
		
		
		Computer com1=new Computer("iMac","silver");
		Computer com2= new Computer("iMac", "silver");
		Computer com3=com2;
		
		System.out.println(com1==com2);
		System.out.println(com1.equals(com2));
		
		
		System.out.println(com2==com3);
		System.out.println(com2.equals(com3));
		
		String str1="java";
		String str2=new String ("java");
		
		
		System.out.println(str1==str2);  //false
		System.out.println(str1.equals(str2)); //true
	}
}
