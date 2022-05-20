package zoo;

public class AnimalApp {

	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.type = "dog";
		dog.name = "タロー";
		dog.crying = "わん！";
		
//		System.out.println(dog.type);
//		System.out.println(dog.name);
//		System.out.println(dog.crying);
		
		Animal cat = new Animal();
		cat.type = "cat";
		cat.name = "ミケ";
		cat.crying = "にゃー！";
				
		dog.walk();
		dog.cry();
		cat.cry();
		cat.escape();
	}

}
