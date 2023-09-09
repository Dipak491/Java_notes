package filehandling;
import java.io.*;

public class WriterDemo {

	public static void main(String[] args)
	{
		try
		{
			FileWriter fwrite = new FileWriter("C:\\Users\\dipak\\OneDrive\\Desktop\\Demo4.text");
			
			fwrite.write("Written using fWriter");
			
			System.out.println("Write successfully...");
			
			fwrite.close();
			
		}
		catch(IOException e)
		{
			System.out.println("Error while writing !!!");
			e.printStackTrace();
		}

	}

}
