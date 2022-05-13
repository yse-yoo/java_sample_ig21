package sample;

import java.util.Arrays;
import java.util.Random;

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
		//1番目
		System.out.println(prices[0]);
		//2番目
		System.out.println(prices[1]);
		//3番目
		System.out.println(prices[2]);
		
//		int[] prices2 = [350, 400, 300];
		
		//じゃんけん
		Random rand = new Random();
		int handIndex = rand.nextInt(3);
		System.out.println(handIndex);
		
		String[] hands = { "グー", "チョキ", "パー" };
		String pcHand = hands[handIndex];
		System.out.println(pcHand);
	}

}
