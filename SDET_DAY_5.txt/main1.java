package day5_assignment;

class BankAccount{
	private final int accountNumber;
	private String name;
	private double balance;
	
	public BankAccount(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void display() {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Name : " + name);
		System.out.println("Balance: " + balance);
		
	}
}

public class main1 {
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount(1234, "Bhakti", 50000);
		BankAccount acc2 = new BankAccount(1235, "Shakti", 76000);
		
		acc1.display();
		System.out.println(" ");
		
		acc2.display();
		
		
//        acc1.acountNumber = 2143;
		
	}

}
