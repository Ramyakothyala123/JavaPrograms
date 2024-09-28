package practice;

public class Short1 {
	short a=13; // non static
	static short b; // static

	public static void main(String[] args) {
		Short1 sh = new Short1(); // created object since this is non static variable
		System.out.println("Vakue of a is:" +sh.a);
		System.out.println("Vakue of b is:" +b);
		System.out.println("Min valus is " + Short.MIN_VALUE);
		System.out.println("Man valus is " + Short.MAX_VALUE);
		System.out.println("Byte range " + Short.BYTES);
		System.out.println("Bit range is " + Short.SIZE);
		
		
		

	}

}
