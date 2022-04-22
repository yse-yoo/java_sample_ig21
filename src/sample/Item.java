package sample;

public class Item {

	public static void main(String[] args) {
		//商品名
		String itemName;
		//価格
		int price;
		//個数
		int amount;
		//セール中
		boolean isSale;
		
		itemName = "コーヒー";
		price = 120;
		amount = 5;
		isSale = true;
		
		System.out.println(itemName);
		System.out.println(price);
		System.out.println(amount);
		System.out.println(isSale);
		
		//税率
	    final float TAX_RATE = 0.1f;
	    System.out.println(TAX_RATE);
	    
	    

	}

}
