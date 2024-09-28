package methods;

public class MultipleParameters {
	
	void hai(String s, int a, char c) {
		System.out.println(s+" "+a +" " + c);
	}

	public static void main(String[] args) {
		MultipleParameters m1 = new MultipleParameters();
		m1.hai("Hi", 5, 'a');
		

	}

}
