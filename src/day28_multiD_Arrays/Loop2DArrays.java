package day28_multiD_Arrays;

import java.util.Arrays;

public class Loop2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] pizzas = {

				{ "pinapple", "pepperoni" }, { "anchovies", "mushroom", "olives" }, { "4 cheese" },
				{ "chicken", "tomatoes", "japalenios", "onions" },
				{ "green peppers", "zuccini", "brocolli", "spinach", "shrimp" } };

		for (String[] pizza : pizzas) {
			System.out.print(pizza.length + "-");
			System.out.println(Arrays.toString(pizza));
		}

		System.out.println("##### FOR LOOP#####");
		for (int i = 0; i < pizzas.length; i++) {
			System.out.print(pizzas[i].length + "-");
			System.out.println(Arrays.toString(pizzas[i]));
		}

		for (String topping : pizzas[0]) {
			System.out.println(topping);
		}

		int[][] students = { { 4, 5, 6 }, { 2, 12, 6 }, { 14, 7, 5, 76, 8 } };

		// outer loop inner loop
		for (int[] group : students) {
			for (int studentId : group) {
				System.out.print(studentId + ", ");
			}
			System.out.println();
		}
		int[][] nums = { { 10, 45 }, 
						{ 20, 67, 54 }, 
						{ 33, 89, 67, 42, 600 },
						{ 555, 673, 123, 568, 753, },

						};
System.out.println("#################");
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
					System.out.print(nums[i][j]+" ");
		
			}
			System.out.println();
		}

	}

}
