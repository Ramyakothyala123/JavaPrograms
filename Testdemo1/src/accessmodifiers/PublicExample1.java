package accessmodifiers; // accessing public modifier within the class

public class PublicExample1 {
	public int a=10;
	
	public PublicExample1() {
	a = 20;
    }
	
	public void m1() {
		System.out.println(a);
	}
	 public static void main(String[] args) {
		 PublicExample1 ex = new PublicExample1();
		System.out.println(ex.a);
		ex.m1();
	}
	 
	 
	
}

	


