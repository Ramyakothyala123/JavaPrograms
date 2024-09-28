package inheritance;

public class MultiLevelInheritance1 extends MultiLevelInheritance {
	
	void m3() {
		System.out.println("welcome to m3");
	}
	
	void m4() {
		System.out.println("Welcome to m4");
	}
	
	public static void main(String[] args) {
		MultiLevelInheritance1 in = new MultiLevelInheritance1();
		in.m1();
		in.m3();
		
	}

}
