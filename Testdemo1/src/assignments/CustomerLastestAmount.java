package assignments;

public class CustomerLastestAmount {
	int amountdeposited = 1000;
	int bankbalnce = 9000;
	int remainingbalnce = amountdeposited + bankbalnce;
	
	public static void main(String[] args) {
		CustomerLastestAmount la = new CustomerLastestAmount();
		System.out.println(la.remainingbalnce);

	}

}
