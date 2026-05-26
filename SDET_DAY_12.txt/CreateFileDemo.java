package File_handling;
import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
	public static void main(String[]args) {
try {
			
			File file = new File("bhakti.txt");
			if(file.createNewFile())
			{
				System.out.println("File Created Successfully");
		    }
			else
			{
				System.out.println("File Already Exists");
            }
			}
		catch(IOException e)
            {
            	System.out.println(e);
            }
	}

}
