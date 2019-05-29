package day43_encapsulation_constructor;

public class Tesla {

	
	
	private String model;
	private int range;
	private double zeroTo60;
	private double price;
	private boolean selfDriving;
	
	
	
	
	
	public void setTeslaInfo(String model, int range, double zeroTo60 , double price, boolean selfDriving) {
		
		setModel(model);
		setRange(range);
		setZeroTo60(zeroTo60);
		setPrice(price);
		setSelfDriving(selfDriving);
	}
	
	public String toString() {
		return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
				+ ", selfDriving=" + selfDriving + "]";
	}

	public void setModel(String model) {
		
		
		
		// call isValidModel	and assign if true
		if(isValidModel(model)) {
			this.model=model;
		}else {
			System.out.println(model+" unknown ");
			
			this.model="unknown";
		}
		
		
		
	}
	
	public String getModel() {
		return model;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getZeroTo60() {
		return zeroTo60;
	}

	public void setZeroTo60(double zeroTo60) {
		this.zeroTo60 = zeroTo60;
	}
	
	public void setPrice(double price ) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	public boolean isSelfDriving() {
		return selfDriving;
	}

	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving = selfDriving;
	}

	
	public boolean isValidModel(String model) {
		
		// 1.st option
		if(model.equalsIgnoreCase("MOdel S")||model.equalsIgnoreCase("Model 3")
				|| model.equalsIgnoreCase("Model X")||model.equalsIgnoreCase("Model Y")|| model.equalsIgnoreCase("Roadster")) {
			return true;
	}
		return false;
	}

//	2.nd option
//		return (model.equalsIgnoreCase("MOdel S")||model.equalsIgnoreCase("Model 3")
//		|| model.equalsIgnoreCase("Model X")||model.equalsIgnoreCase("Model Y")|| model.equalsIgnoreCase("Rooster"));
//		
		
		
		
		//3.rd option
		
		
//		switch(model.toLowerCase()) {
//		case "MOdel S":
//		case "Model 3":
//		case "Model X":
//		case "Model Y":
//		case "Roadster":
//			return true;
//			default:
//				return false;
//		}
		
		
		
		
		
}
