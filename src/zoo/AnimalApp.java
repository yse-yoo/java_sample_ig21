package zoo;

public class AnimalApp {

	public static void main(String[] args) {
		Animal dog = new Animal("dog", "タロー", "わん！");
		Animal cat = new Animal("cat", "ミケ", "にゃー！");
				
		dog.walk();
		dog.cry();
		cat.cry();
		cat.escape();
	}

}
