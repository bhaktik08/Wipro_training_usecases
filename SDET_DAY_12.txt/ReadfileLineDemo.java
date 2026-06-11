package File_handling;
import java.io.*;
import java.io.IOException;

public class ReadFileLineDemo {
	 public static void main(String[] args)
	    {
	        try {
	            FileReader reader = new FileReader("renu.txt");
	            int ch;
	            
	            while((ch = reader.read()) != -1)
	            {
	                System.out.print((char) ch); 
	            }

	            reader.close();
	        }

	        catch(IOException e)
	        {
	            System.out.println(e);
	        }
	    }

}
