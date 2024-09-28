package accessmodifiers1;// Public modifier outside the package

import accessmodifiers.PublicExample1;

public class PublicExample3 {

	public static void main(String[] args) {
		PublicExample1 a = new PublicExample1();
		System.out.println(a.a);
		a.m1();

	}

}
