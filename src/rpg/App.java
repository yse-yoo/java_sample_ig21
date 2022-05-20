package rpg;

public class App {

	public static void main(String[] args) {
		//インスタンスを生成
		Character wizard = new Character();
		//syso を入力、Ctrl + スペース
		System.out.println(wizard);
		
		wizard.name = "アリス";
		wizard.job = "wizard";
		wizard.hp = 30;
		
		System.out.println(wizard.name);
		System.out.println(wizard.job);
		System.out.println(wizard.hp);
		
		wizard.walk("left");
		
		Character warrior = new Character();
		warrior.name = "ボブ";
		warrior.job = "warrior";
		warrior.hp = 50;
		
		wizard.talk(warrior, "勝負しましょう！");
		
	}

}
