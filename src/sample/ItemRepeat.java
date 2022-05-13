package sample;

public class ItemRepeat {

	public static void main(String[] args) {
		//forを入力して Ctrl + スペース	
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				String plot = "(" + i + "," + j + ")";
				System.out.print(plot);
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int answer = i * j;
				String message = answer + " ";
				System.out.print(message);
			}
			System.out.println();
		}

		//データの繰り返し
		String[] drinks = { "コーヒー", "紅茶", "ほうじ茶" };
		for (int i = 0; i < drinks.length; i++) {
			String string = drinks[i];
			System.out.println(string);
		}
		
		//while
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		//1 - 1000までの 7の倍数を５つ表示
		int currentNumber = 1;
		int maxNumber = 1000;
		int count = 0;
		int limit = 5;

		while (currentNumber < maxNumber) {
			//7の倍数だったらカウント
			if (currentNumber % 7 == 0) {
				System.out.println(currentNumber);
				count++;
			}
			//個数がリミットに達したら終了
			if (count == limit) {
				break;
			}
			currentNumber++;
		}
		
		
		//問題1
		int sum = 0;
		for (int j = 1; j <= 3000; j++) {
			sum += j;
		}
		System.out.println(sum);
		

		//問題2
		count = 0;
		currentNumber = 1;
		maxNumber = 1000;
		while (currentNumber < maxNumber) {
			//17の倍数だったらカウント
			if (currentNumber % 17 == 0) {
				count++;
			}
			currentNumber++;
		}
		System.out.println("17の倍数:" + count);
		
		//問題3
		float money = 1000000;
		float target = 2000000;
		float interestRate = 0.0001f;
		int year = 0;

		while (money < target) {
			money *= (1f + interestRate);
			year++;
		}
		System.out.println(year + "年後に" + money);
	}

}
