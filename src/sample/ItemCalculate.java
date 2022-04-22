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
		price = 100;
		amount = 0;
		float average = price / amount;
		System.out.println(average);
				
	}

}
