package practice;

public class Float1 {
	float a= 3.123f;
	float b;

	public static void main(String[] args) {
		Float1 fl = new Float1();
		System.out.println("Value of a" + fl.a);
		System.out.println("Value of b " + fl.b); 
		System.out.println("Min value " + Float.MIN_VALUE);
		System.out.println("Max value " +Float.MAX_VALUE);
		System.out.println("Byte range " + Float.BYTES);
		System.out.println("Bit range " + Float.SIZE);

	}

}
