package day47_blocks;

public class AllBlock {
	
	int nonStatic=10;
	static int staticInt=10;

	
	static {
	System.out.println("static block - I run first and only once");
	staticInt--;
}
	{
		System.out.println("Init Block - I run each time objects is created .Before constructor");
		nonStatic+=5;
		staticInt+=5;
		
	}
	
	
	public AllBlock() {
		System.out.println("Constructor - I run each time object is created .after init block runs");
		nonStatic+=3;
		staticInt+=3;
		
	}
}
