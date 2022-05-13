package sample;

import java.util.Arrays;

public class Drink {

	public static void main(String[] args) {
		String[] drinks = { "コーヒー", "紅茶", "ほうじ茶" };
		System.out.println(drinks);
		System.out.println(Arrays.toString(drinks));
		
		int[] numbers = new int[3];
		numbers[0] = 55;
		numbers[1] = 32;
		numbers[2] = 72;
		System.out.println(Arrays.toString(numbers));
		
		int[] prices = { 350, 400, 300 };
		System.out.println(prices[0]);
		System.out.println(prices[1]);
		System.out.println(prices[2]);
		
		
	}

}
