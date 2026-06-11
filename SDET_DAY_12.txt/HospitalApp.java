package File_handling;

import java.io.*;
import java.util.Scanner;

public class HospitalApp {
	
	public static void main(String[]args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Patient ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
	    System.out.print("Enter Patient Name: ");
	    String name = sc.nextLine();
	        
		System.out.print("Enter Disease: ");
	    String disease = sc.nextLine();

	    System.out.print("Enter Doctor Name: ");
	    String doctor = sc.nextLine();
	    
	    
	    FileWriter fw1 = new FileWriter("patients.txt", true);
        fw1.write("ID: " + id + " | Name: " + name + " | Disease: " + disease + "\n");
        
        fw1.close();
        
        FileWriter fw2 = new FileWriter("reports.txt", true);
        fw2.write("Patient: " + name + " | Disease: " + disease + " | Doctor: " + doctor + "\n");
        
        fw2.close();
	    
        System.out.println("\nData Saved Successfully!");
        
        System.out.println("\n--- Patient Records ---");
        
        BufferedReader br1 = new BufferedReader(new FileReader("patients.txt"));
        
        String line;
        
        while ((line = br1.readLine()) != null) 
        {
            System.out.println(line);
        }
        
        br1.close();


        System.out.println("\n--- Medical Reports ---");
        
        BufferedReader br2 = new BufferedReader(new FileReader("reports.txt"));
        
        while ((line = br2.readLine()) != null)
        {
            System.out.println(line);
        }
        
        br2.close();
    }
	

}
