package accessmodifiers;

public class Protected {
	protected int a=8;
	protected void m4() {
		System.out.println("Bye");
	}

	public static void main(String[] args) {
		Protected p = new Protected();
		System.out.println(p.a);
		p.m4();

	}

}
