package day50_inheritance03;

public class SlackChannel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		SlackUser su = new SlackUser("nadir");
		AdminUser au =new AdminUser("Florian");
		su.sendAMessage("Hi guyz");
		au.sendAMessage("Thank You");
		
		
	}

}
