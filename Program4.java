package assessment1;
import java.util.*;

//write a program to print sum of nth square number.
public class Program4 {

	static void PrintSum(int num)
	{
		int isum = 0;
		
		for(int i =0; i<=num; i++)
		{
			
			isum = isum + (i*i);
			
		}
		System.out.println("Sum of square from 0 to " +num+" is " +isum);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = sc.nextInt();
		
		PrintSum(i);
	}

}
