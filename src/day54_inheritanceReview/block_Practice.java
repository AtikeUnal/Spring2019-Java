package day54_inheritanceReview;

public class block_Practice {
static String name;
static {
	name ="John";
}




{
name="Aaron";	
	
}
int num1=10;
static int num2=10;

public block_Practice() {
	name="Murodil";
}
public static void main(String[] args) {
	block_Practice obj =new block_Practice();
	obj.num1=20;
	obj.num2=20;
	System.out.println(name);
	System.out.println(obj.num1);
	System.out.println(obj.num2);
	
	block_Practice obj2 =new block_Practice();
	System.out.println(obj2.num1);
	System.out.println(obj2.num2);
}
}
