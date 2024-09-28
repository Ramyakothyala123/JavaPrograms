package inheritance;

public class MultiLevelInheritance2 extends MultiLevelInheritance1{
	void m5() {
		System.out.println("Welcome to m5");
	}

	public static void main(String[] args) {
		MultiLevelInheritance2 mu = new MultiLevelInheritance2();
		mu.m1();
		mu.m2();
		mu.m3();
		mu.m4();
		mu.m5();
		

	}

}
