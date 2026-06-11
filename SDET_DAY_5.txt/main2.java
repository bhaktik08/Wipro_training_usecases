package day5_assignment;

class Payment {

    public final void processPayment(double amount) {
        System.out.println("Processing secure payment of " + amount);
    }
}

class CreditCardPayment1 extends Payment {

    
//    public void processPayment(double amount) {
//        System.out.println("Overridden method");
//    }
//    

    public void showMessage() {
        System.out.println("Payment done using Credit Card");
    }
}
public class main2 {
	public static void main(String[] args) {

        CreditCardPayment1 p = new CreditCardPayment1();

        p.processPayment(5000); 
       
    }

}
