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
	}

}
