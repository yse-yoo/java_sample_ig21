package sample;

public class Method {

	public static void main(String[] args) {
		Float answer = calculate(5f);
		System.out.println(answer);

		answer = calculate(-3f);
		System.out.println(answer);

		//staticでないメソッドは直接実行できない
//		answer = calculate2(-3f);
		
		int totalPrice = calculateTotalPrice(100, 5);
		System.out.println(totalPrice);
		
		greet("横浜　太郎");
		greet("横浜　太郎", "雨");
		
		totalPrice = calculateTotalPrice(100, 5);
		System.out.println(totalPrice);

		totalPrice = calculateTotalPrice(100, 5, 0.1f);
		System.out.println(totalPrice);

		totalPrice = calculateTotalPrice(100, 5, 0.08f);
		System.out.println(totalPrice);
	}
	
	public static int calculateTotalPrice(int price, int amount) {
		int totalPrice = price * amount;
		return totalPrice;
	}

	public static int calculateTotalPrice(int price, int amount, float taxRate) {
		float totalPrice = price * amount * (1f + taxRate);
		return (int) totalPrice;
	}
	
	static void greet(String name) {
		System.out.println(name + "さん、こんにちは");
	}
	
	static void greet(String name, String weather) {
		System.out.println(name + "さん。今日は" + weather + "です");
	}
	
	public static Float calculate(Float x) {
		Float y = x + 3;
		return y;
	}

	public Float calculate2(Float x) {
		Float y = x + 3;
		return y;
	}

}
