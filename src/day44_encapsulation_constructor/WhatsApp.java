package day44_encapsulation_constructor;

public class WhatsApp {

	
	private String toNumber;
	private String message;
	private boolean delivered;
	
	
	
	public WhatsApp() {
		
		System.out.println("No-Args Constructor");
	}
	public WhatsApp(String toNumber, String message) {
		
		//this () keyword must be the first statement in the calling constructor.	
		this();
		System.out.println("2 Args constructor");
		
		this.message=message;
		this.toNumber=toNumber;
		
	}
	
	public WhatsApp (String toNumber) {
		//to number,"[]"
//		this.toNumber=toNumber;
//		this.message="[]";
		
		this(toNumber,"[]");
		
		
		System.out.println("one arg constructor");
	}
	
	
	
	public String toString() {
		return "WhatsApp [toNumber=" + toNumber + ", message=" + message + ", delivered=" + delivered + "]";
	}
	
	
	
	
	public String getToNumber() {
		return toNumber;
	}
	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	
	
	
}
