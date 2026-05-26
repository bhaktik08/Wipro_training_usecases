package day6_Assignment;

import java.util.Scanner;

class InvalidPinException extends Exception {
    String message;
    
    InvalidPinException(String message){
    	this.message = message;
    }
    
    public String getMessage() {
    	return message;
    }
}

public class ATM {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("User inserts card");

            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            int correctPin = 1234;

            if (pin != correctPin) {
                throw new InvalidPinException("Incorrect PIN");
            }
            else {

            System.out.println("PIN is correct. Access granted");
            }

        } catch (InvalidPinException e) {
            System.out.println("Exception: " + e.getMessage());

        } finally {
            System.out.println("Transaction logged (finally block always runs)");
        }

        sc.close();
	
	}

}
