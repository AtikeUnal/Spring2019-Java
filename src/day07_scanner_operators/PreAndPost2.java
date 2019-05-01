package day07_scanner_operators;

public class PreAndPost2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int messages= 10;
messages++;
++messages;
System.out.println("Messages: "+ messages);
		
	int readMessages=--messages;
	
		System.out.println("ReadMessages: "+ readMessages);
		System.out.println("Messages: "+messages);
		
		int unreadMessages=readMessages--;
		
		System.out.println("UnreadMessages: "+readMessages);
		int total= unreadMessages++ - readMessages--;
		System.out.println("Total: " +total);
		
		
		
		int count= 20;
		int count2= 10;
		int totalCount= ++count + --count2;
		System.out.println("count: "+count);
		System.out.println("count2: "+count2);
		System.out.println("total: "+totalCount);
		
		
		int myCount= count++ + ++count;
		System.out.println("count: "+ count);
		System.out.println("mycount: "+ myCount);
		
		
		

		
	}

}
