package zoo;

public class Animal {
	//種別
	public String type;

	//名前
	public String name;

	//鳴き声
	public String crying;
	
	public void walk() {
		String message = this.name + "が歩いた";
		System.out.println(message);
	}

	public void cry() {
		System.out.println(this.crying);
	}

	public void escape() {
		String message = this.name + "が逃げた！";
		System.out.println(message);
	}
}
