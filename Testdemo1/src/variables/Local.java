package variables;

public class Local {
	int a; // instance variable
	
	static void m1() {
		int c =30;  // Local variable
		System.out.println(c);
	}

	public static void main(String[] args) {
		m1();

	}

}
