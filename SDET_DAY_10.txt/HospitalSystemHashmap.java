package day10_Usecase;

import java.util.*;

class patientDetails{
	int id;
	String name;
	
	patientDetails(int id, String name){
		this.id = id;
		this.name = name;
	}
}

public class HospitalSystemHashmap {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, patientDetails> map = new HashMap<>();
	
		while(true) {
            System.out.println("1.Add 2.Update 3.Get 4.Remove 5.List 6.Check 7.Count 8.Clear 9.Exit");
            int ch = sc.nextInt();
            sc.nextLine();
            
            switch(ch) {
            
            case 1:
            	System.out.print("Enter Id: ");
            	int id = sc.nextInt();
            	sc.nextLine();
            	
            	System.out.print("Enter Name: ");
            	String name = sc.nextLine();
            	
            	map.put(id, new patientDetails(id, name));
            	System.out.println("Patient Added");
                break;
            	
                
            case 2:
            	 System.out.print("Enter ID: ");
                 id = sc.nextInt();
                 sc.nextLine();
                 
                 if(map.containsKey(id)) {
                	 System.out.print("Enter new name: ");
                     name = sc.nextLine();
                     map.put(id, new patientDetails(id, name));
                 	 System.out.println("Updated Patient name");
                 }
                 else {
                	 System.out.println("Not Found");
                 }
                 break;
                 
            case 3:
            	 System.out.print("Enter ID: ");
                 id = sc.nextInt();
                 
                 patientDetails p = map.get(id);
                 if(p != null) {
                	 System.out.println(p.id + " " + p.name);
                 }
                 else {
                	 System.out.print("Not Found");
                 }
                 break;
                 
            case 4:
            	 System.out.print("Enter ID: ");
                 id = sc.nextInt();
                 
                 map.remove(id);
                 System.out.println("Removed patient");
                 break;
                 
            case 5:
            	for(patientDetails pat : map.values()) {
            		System.out.println(pat.id + " " + pat.name);
            	}
            	break;
            	
            case 6:
            	 System.out.print("Enter ID: ");
                 id = sc.nextInt();
                 
                 if(map.containsKey(id)) {
                	 System.out.println("Patients Exits");
                 }
                 else {
                	 System.out.println("Patients not Exists");
                 }
                 
            case 7:
            	System.out.println("Total patient: " + map.size());
            	break;
            	
            case 8:
            	map.clear();
            	System.out.println("All cleared");
            	break;
            	
            case 9:
            	sc.close();
            	return;
            	
            default : 
            	System.out.println("INvalid");
            }

		}
	}

}
