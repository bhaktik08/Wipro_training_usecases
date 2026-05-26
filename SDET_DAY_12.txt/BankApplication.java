package File_handling;

import java.io.*;
import java.util.Scanner;


public class BankApplication {
	
	public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();

        System.out.print("Enter Transaction Type (deposit/withdraw): ");
        String type = sc.next();

        
        FileWriter fw = new FileWriter("transactions.txt", true);
        fw.write("Account: " + acc + " | " + type + ": " + amount + "\n");
        fw.close();

        
        System.out.println("\nTransaction Saved Successfully!");

        BufferedReader br = new BufferedReader(new FileReader("transactions.txt"));

        
        String line;
        System.out.println("\n--- Transaction History ---");

        
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }

}
