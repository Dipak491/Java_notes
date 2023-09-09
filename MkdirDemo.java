package filehandling;
import java.io.File;
import java.util.*;

public class MkdirDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		try
		{
			System.out.println("Enter the make directorys");
			File dir = new File("\"C:\\Users\\dipak\\OneDrive\\Desktop\\"+str);
			
			
			boolean value = dir.mkdir();
			
			if(value)
				System.out.println("Directoey created");
			
			else
				System.out.println("Directory Not created ");
			
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
