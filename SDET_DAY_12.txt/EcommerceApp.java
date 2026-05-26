package File_handling;

import java.io.*;
import java.util.Scanner;

public class EcommerceApp {
	
	 public static void main(String[] args) throws Exception {

	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter Customer Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Product Name: ");
	        String product = sc.nextLine();

	        System.out.print("Enter Quantity: ");
	        int qty = sc.nextInt();

	        System.out.print("Enter Price per item: ");
	        int price = sc.nextInt();
	        sc.nextLine(); 

	        System.out.print("Enter Shipping Address: ");
	        String address = sc.nextLine();

	        int total = qty * price;

	        
	        FileWriter orderFile = new FileWriter("orders.txt", true);
	        orderFile.write(name + " ordered " + product + " Qty: " + qty + "\n");
	        orderFile.close();

	        
	        FileWriter invoiceFile = new FileWriter("invoice.txt", true);
	        invoiceFile.write("Customer: " + name + " | Product: " + product + " | Total: " + total + "\n");
	        invoiceFile.close();


	        FileWriter shipFile = new FileWriter("shipping.txt", true);
	        shipFile.write("Customer: " + name + " | Address: " + address + "\n");
	        shipFile.close();

	        System.out.println("\nData Saved Successfully!");


	        System.out.println("\n--- Orders ---");
	        BufferedReader br1 = new BufferedReader(new FileReader("orders.txt"));
	        String line;
	        while ((line = br1.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        br1.close();


	        System.out.println("\n--- Invoices ---");
	        BufferedReader br2 = new BufferedReader(new FileReader("invoice.txt"));
	        while ((line = br2.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        br2.close();


	        System.out.println("\n--- Shipping Details ---");
	        BufferedReader br3 = new BufferedReader(new FileReader("shipping.txt"));
	        while ((line = br3.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        br3.close();
	        
	    }

}
