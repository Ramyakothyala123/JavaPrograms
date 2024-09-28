package accessmodifiers; // accessing public modifier outside the class

public class PublicExample {

	public static void main(String[] args) {
		PublicExample1 ex = new PublicExample1();
		System.out.println(ex.a);
		ex.m1();

	}

}
