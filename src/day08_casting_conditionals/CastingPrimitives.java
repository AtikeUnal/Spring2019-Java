package day08_casting_conditionals;

public class CastingPrimitives {

	public static void main(String[] args) {
//cast double value to int
		int i=(int)3.4;//will remove .4
		System.out.println("i: "+ i);
		
		double price=230.50;
		int dollars=(int)price;
		System.out.println(price);
		System.out.println(dollars);
		
		//whwole numbers byte, short, int
		
		int count=244;
		byte byteCount= (byte)count;// try to make sure it can handle that kind of number big numbers cannot fit small containers.
		
		System.out.println("ByteCount: "+byteCount);
		
		long longValue=345645L;
		int intValue= (int)longValue;
		
		System.out.println(intValue);
		System.out.println(longValue);
		
		int large =5678;
		short small=(short) large;
		
		System.out.println(small);
		//250     250     250.2
	int result= (int)(500.4/2.0);
	
		System.out.println("result: " +result);
		
		

		//it will automatically cast it. no need to put(int)but (int) also works.
		//implicit casting-->automatic casting from smaller type into larger type.
		//explicit casting is used when converting from larger type into smaller type.
		
		
		
		
		
		
		
		
		
		
	}

}
