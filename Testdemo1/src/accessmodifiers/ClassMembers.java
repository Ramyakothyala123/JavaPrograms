package accessmodifiers;

public class ClassMembers {
	
	int a =100;
	
	public ClassMembers() {
	this.a=140;
		}

	void hello() {
		System.out.println("Welcome to Java");
	}
	
	
	public static void main(String[] args) {
		ClassMembers c = new ClassMembers();
		System.out.println(c.a);
		c.hello();

	}

}
