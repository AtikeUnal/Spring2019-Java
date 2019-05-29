package day40_customClasses_methods;

public class BestBuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CellPhone cell1 = new CellPhone();
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);

		cell1.brand = "Nokia 6300";
		cell1.screenSize = 2.0;
		cell1.color = "Silver";
		cell1.price = 76.16;

		System.out.println("Brand: " + cell1.brand);
		System.out.println("ScreenSize: " + cell1.screenSize);
		System.out.println("Color: " + cell1.color);
		System.out.println("price: " + cell1.price);

		CellPhone cell2 = new CellPhone();
		cell2.brand = "Simens";
		cell2.screenSize = 1.5;
		cell2.color = "pink";
		cell2.price = 39.22;

		System.out.println("###### Cell2 Values#####");

		System.out.println("Brand: " + cell2.brand);
		System.out.println("ScreenSize: " + cell2.screenSize);
		System.out.println("Color: " + cell2.color);
		System.out.println("price: " + cell2.price);

		System.out.println("###### CALLING METHODS #######");

		cell1.call();
		cell1.message();
		cell1.takeAPhoto();

		cell2.call();
		cell2.message();
		cell2.message();
		cell2.takeAPhoto();
	}

}
