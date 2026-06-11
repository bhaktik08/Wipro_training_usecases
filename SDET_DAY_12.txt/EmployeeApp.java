package File_handling;

import java.io.*;

class Employee implements Serializable {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
}

	public class EmployeeApp {
	    public static void main(String[] args) throws Exception {

	        
	        Employee e1 = new Employee(101, "Bhakti", 50000);

	        
	        ObjectOutputStream oos =
	            new ObjectOutputStream(new FileOutputStream("employee.dat"));

	        oos.writeObject(e1);
	        oos.close();

	        System.out.println("Employee data saved!");

	    
	        ObjectInputStream ois =
	            new ObjectInputStream(new FileInputStream("employee.dat"));

	        Employee e2 = (Employee) ois.readObject();

	        System.out.println("\nEmployee Details:");
	        System.out.println("ID: " + e2.id);
	        System.out.println("Name: " + e2.name);
	        System.out.println("Salary: " + e2.salary);

	        ois.close();
	    }

	}
