package assessment1;
import java.util.*;

//write a series program 0,1,3,6,10,15,......n


public class Problem3 
{
	static void series(int num)
	{
		int isum =0;
		for(int i =0; i<10;i++)
		{
			isum = i+isum;
			System.out.print(isum+" ");
		}
	
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number where you want to print series");
		int i = sc.nextInt();
		
		series(i);
		

	}

}
