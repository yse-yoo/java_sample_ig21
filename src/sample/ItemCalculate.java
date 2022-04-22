/**
 *
 */
package sample;


/**
 * 商品の計算処理
 * 
 * ItemCalculate
 * 
 * @author youhei_yoshikawa
 */
public class ItemCalculate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int answer = 1 + 2;
		System.out.println(answer);
		
		answer = answer + 3;
		answer = answer - 2;
		answer = answer * 5;
		answer = answer / 2;
		
		System.out.println(answer);
		
		int mod = answer % 3;
		System.out.println(mod);
		
		//cast
		int price = 237;
		float pointRate = 0.05f;
		
		float point = price * pointRate;
		System.out.println(point);
		System.out.println((int) point);
		
		String itemName = "コーヒー";
		String message = itemName + "の価格は" + price + "円です";
		System.out.println(message);

		//単項演算
		int amount = 5;
		//１増える increment
		amount++;
		System.out.println(amount);
		
		//１減る decrement
		amount--;
		System.out.println(amount);


		//複合演算
		price = 110;
		amount = 3;
		
//		price = price - 10;
		price -= 10;
		
//		price = price * amount;
		price *= amount;
		
		System.out.println(price);

		message = itemName + "の価格は" + price + "円です。\n";
		message += "購入しますか？";
		System.out.println(message);
		
		//オーバーフロー
		price = 100000;
		amount = 100000;
		long totalPrice = (long) price * (long) amount;
		System.out.println(totalPrice);
		
		//
//		price = 100;
//		amount = 0;
//		float average = price / amount;
//		System.out.println(average);
		
		//論理演算
		boolean isMatch;
		price = 100;

		isMatch = (price == 100);
		System.out.println(isMatch);
		
		isMatch = (price != 100);
		System.out.println(isMatch);
		
		isMatch = (price >= 100);
		System.out.println(isMatch);

		isMatch = (price < 100);
		System.out.println(isMatch);
		

		//同値
		String str1 = "20";
		String str2 = "20";
		int number1 = 20;
		int number2 = 30;
		
		isMatch = (str1 == str2);
		System.out.println(isMatch);

		isMatch = (number1 == number2);
		System.out.println(isMatch);
		
		isMatch = (Integer.parseInt(str1) == number1);
		System.out.println(isMatch);
		
		//三項演算
		price = 250;
		int money = 200;
		
		message = (money > price) ? "買えます" : "買えません";
		System.out.println(message);
		
//		int city = "東京";
		
		
		String character_name = "Tokyo";
		String monster_name = "スライム";

		int character_hp = 20;
		int monster_hp = 5;
		int damage = 10;

		String battle_message = character_name + "のこうげき！";
		String attack_message = (monster_hp > damage) ? "に" + damage + "のダメージ" : "はたおれた！";
		battle_message += monster_name + attack_message;
		System.out.println(battle_message);

	}

}
