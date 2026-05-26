package day5_assignment;

interface payment{
	void pay(double amount);
	
	default void receipt(double amount) {
		System.out.println("payment of " + amount + "completed.");
	}
}

class CreditCardPayment implements payment{
	
	public void pay(double amount) {
		System.out.println("Paid " + amount + " using Credit Card ");
	}
}

class UPIPayment implements payment {
	public void pay(double amount) {
		System.out.println("Paid " + amount + " using UPI");
	}
}


public class Main {
	public static void main(String[] args) {
		payment p1 = new CreditCardPayment();
		p1.pay(5000);
		p1.receipt(5000);
		
		System.out.println();
		
		payment p2 = new UPIPayment();
		p2.pay(2000);
		p2.receipt(2000);
	}

}
