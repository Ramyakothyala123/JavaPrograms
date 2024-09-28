package methods;

public class StaticMethods {
	static int a=10;
	public static void hello() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		StaticMethods.hello();

	}

}
