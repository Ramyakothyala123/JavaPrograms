package accessmodifiers;// within the class

public class PrivateExample {
	private int a=40;
	private void m1() {
		System.out.println("Hai");
	}

	public static void main(String[] args) {
		PrivateExample e = new PrivateExample();
		System.out.println(e.a);
		e.m1();
		

	}

}
