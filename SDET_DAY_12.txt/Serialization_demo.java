package File_handling;
import java.io.*;

class Student implements Serializable	{
	int id;
	String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
}

public class Serialization_Demo {
	 public static void main(String[] args) throws Exception {

	        Student s1 = new Student(1, "Bhakti");

	        ObjectOutputStream oos =
	            new ObjectOutputStream(new FileOutputStream("file.txt"));
	        oos.writeObject(s1);
	        oos.close();
	        
	        System.out.println("Object Serialized");
	 }
}
