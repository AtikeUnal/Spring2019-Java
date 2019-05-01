package day25_Arrays03;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] product = { "timberland Shoes", "H&M Shirt", "Swatch Watch", "Gucci Bag", "Adidas socks" };

		double[] prices = { 120, 5.99, 150.50, 3000.5, 6.99 };

		int itemsId[] = { 1234, 34324, 654645, 342423, 3432432 };

		System.out.println("Product count: " + product.length);

		if (product.length == prices.length && itemsId.length == product.length) {
			System.out.println("Shopping list looks good");
		} else {
			System.out.println("Something is wrong in this list");
			return;
		}

		for (String shop : product) {
			System.out.println(shop);
		}

		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}

		for (int i = itemsId.length - 1; i < 0; i--) {
			System.out.println(itemsId[i]);
		}
		System.out.println("########Your Shopping Reciept");
		double total = 0.0;
		for (int t = 0; t < prices.length; t++) {

			System.out.println("Item " + (t + 1) + ": " + itemsId[t] + " - " + product[t] + " - $" + prices[t]);

			total += prices[t];
		}
		System.out.println("Total price: $" + total);
		int max = 0;
		double maxPrice = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] > maxPrice) {
				maxPrice = prices[i];
				max = i;

			}
		}

		System.out.println(itemsId[max] + " - " + product[max] + " - $" + maxPrice);

		int min = Integer.MAX_VALUE;
		double minPrice = 0;
		for (int a = min; a < prices.length; a--) {
			if (prices[a] < minPrice) {
				minPrice=prices[a];
				min=a;
			}
		}
		System.out.println(itemsId[min] + " - " + product[min] + " - $" + minPrice);

	}

}
