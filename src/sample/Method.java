package sample;

public class Method {

	public static void main(String[] args) {
		Float answer = calculate(5f);
		System.out.println(answer);
	}

	public static Float calculate(Float x) {
		Float y = x + 3;
		return y;
	}
}
