package File_handling;

import java.io.*;
import java.util.Scanner;

public class FoodDeliveryApp {
	
	public static void main(String[] args) throws Exception {
	
	        Scanner sc = new Scanner(System.in);


	        FileWriter menuFile = new FileWriter("menu.txt", true);
	        menuFile.write("Pizza - 200\nBurger - 100\nFries - 90");
	        menuFile.close();

	     
	        System.out.print("Enter Customer Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Food Item: ");
	        String item = sc.nextLine();

	        System.out.print("Enter Quantity: ");
	        int qty = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Delivery Address: ");
	        String address = sc.nextLine();


	        FileWriter orderFile = new FileWriter("foodorders.txt", true);
	        
	        orderFile.write(name + " ordered " + item + " Qty: " + qty + "\n");
	        orderFile.close();

	        
	        FileWriter deliveryFile = new FileWriter("delivery.txt", true);
	        
	        deliveryFile.write("Customer: " + name + " | Address: " + address + "\n");
	        deliveryFile.close();

	        System.out.println("\nData Saved Successfully!");

	        
	        System.out.println("\n--- Menu ---");
	        
	        BufferedReader br1 = new BufferedReader(new FileReader("menu.txt"));
	        String line;
	        while ((line = br1.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        br1.close();

	        
	        System.out.println("\n--- Orders ---");
	        
	        BufferedReader br2 = new BufferedReader(new FileReader("foodorders.txt"));
	        while ((line = br2.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        br2.close();

	       
	        System.out.println("\n--- Delivery Logs ---");
	        
	        BufferedReader br3 = new BufferedReader(new FileReader("delivery.txt"));
	        while ((line = br3.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        br3.close();
	    
	}

}
