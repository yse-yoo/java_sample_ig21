package rpg;

public class App {

	public static void main(String[] args) {
		//インスタンスを生成
		Character wizard = new Character("アリス", "wizard");
		//syso を入力、Ctrl + スペース
		System.out.println(wizard);
		
		System.out.println(wizard.name);
		System.out.println(wizard.job);
		System.out.println(wizard.hp);
		
		wizard.walk("left");
		
		Character warrior = new Character("ボブ", "warrior");
		
		wizard.talk(warrior, "勝負しましょう！");
		
		wizard.attack(warrior);
		System.out.println(warrior.hp);
	}

}
