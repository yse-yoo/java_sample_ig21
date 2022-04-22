package sample;

public class Condition {

	public static void main(String[] args) {
		//距離(km)
		int distance = 3;

		//移動手段
		String movingMethod;

		if (distance >= 5) {
			//5km以上の場合
			movingMethod = "電車";
		} else if (distance >= 1 && distance < 5) {
			//1km以上、5km未満の場合
			movingMethod = "自転車";
		} else {
			//それ以外
			movingMethod = "徒歩";
		}
		
		System.out.println(movingMethod);

	}

}
