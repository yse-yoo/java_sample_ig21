package rpg;

public class Character {
	//フィールド
	//キャラクター名
	public String name;

	//職業
	public String job;

	//体力
	public int hp;

	
	//インスタンスメソッド
	//歩く
	public void walk(String direction) {
		String message = this.name + " move " + direction;
		System.out.println(message);
	}
}
