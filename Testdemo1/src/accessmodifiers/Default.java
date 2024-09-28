package accessmodifiers; // with the class

 class Default {
	 
	 int b =9;
	 void m2() {
		 System.out.println("Hi");
	 }

	public static void main(String[] args) {
		Default d = new Default();
		d.m2();
		System.out.println(d.b);

	}

}
