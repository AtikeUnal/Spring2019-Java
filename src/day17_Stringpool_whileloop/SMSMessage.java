package day17_Stringpool_whileloop;
import java.util.*;
public class SMSMessage {




		public static void main(String[] args) {
			// TODO Auto-generated method stub

			    Scanner scan = new Scanner(System.in);
			    String message = scan.nextLine();
			    String sender;
			    String phoneNumber;
			    String messageBody;
			  //  Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

			     sender = message.substring(message.indexOf("<")+1,message.indexOf(">"));
			  phoneNumber =message.substring(message.indexOf("[")+1,message.indexOf("]"));
			    messageBody = message.substring(message.indexOf("{")+1,message.indexOf("}"));
			    
			    
			    System.out.println("Sender: "+ message);
			    System.out.println("Phone Number: "+phoneNumber);
			    System.out.println("Message body: "+messageBody);
		}
	
	
	
	
	
	
}
