package day63_Exceptions;

public class TryWithFinnaly {
public static void main(String[] args) {
	//dont use it real coding
	try {
	System.out.println("In Try Block");
	System.out.println(10/0);
	}finally {
		System.out.println("In Finally");
		
	}
	
	System.out.println("After try finally");
}
}
