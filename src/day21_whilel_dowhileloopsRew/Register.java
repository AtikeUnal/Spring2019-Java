package day21_whilel_dowhileloopsRew;
import java.util.*;
public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner scan = new Scanner(System.in);
			
			
			System.out.println("How many items did you purchase? ");
			int purchase=scan.nextInt();
			double totalprice=0.0;
			String item= "";
			
			for(int i=1; i<=purchase;i++) {
				System.out.println("What is item "+i+"?");
				String name=scan.next();
				 item+=name+", ";
				
				 System.out.println("How much is "+name+"?");
				double cost= scan.nextDouble();
				 totalprice += cost;
				
				 if(item.endsWith(", ")) {
						System.out.println(item.substring(0,item.length()-2));
						
			}
			
			
			}
		//item=item
			System.out.println("Your items: "+item);
		System.out.println("Your total Price: $"+totalprice);
		
		
		
	}

}
