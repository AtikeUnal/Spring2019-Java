package day36_WrapperClasses_arrayList;

public class WrapperClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);

		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);

		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);

		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		
		int count = Integer.parseInt("6575675");
		System.out.println(count);
		
		int count2 = Integer.valueOf("54365464");
		System.out.println(count2);
		
		
		System.out.println(Character.isAlphabetic('a'));
		
		System.out.println(Character.isAlphabetic('1'));
		
		System.out.println(Character.isAlphabetic('$'));
		
		System.out.println(Character.isLetter('@'));

		System.out.println(Character.isDigit('9'));
		
		String str="java101";
		
		System.out.println(Character.isAlphabetic(str.charAt(0)));
		
		System.out.println(Character.isDigit(str.charAt(6)));
		
		
		
		String words= "abc1234cf43242er";
		
		for (int i =0;i<words.length();i++) {
			if(Character.isDigit(words.charAt(i))) {
				System.out.print(words.charAt(i));
			}
		}
		System.out.println();
		
		
		
		
		
		
	}

}
