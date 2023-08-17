package assessment1;
import java.util.*;


// write a program to take 10 input number from user in array and print in asending and descending order 

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		System.out.println("Enter 10 Elements of array ");
		
		for(int i = 0; i<a.length; i++)
			{
				a[i] = sc.nextInt();
			}
		System.out.println("Original Array");
		System.out.println(Arrays.toString(a));
		
		// To ascending order 
		for(int j = 0; j<a.length; j++)
		{
			for(int k = j+1; k<a.length; k++)
			{
				if(a[j] > a[k]) 
				{
					int temp = a[j];
					a[j] = a[k];
					a[k] = temp;
					
				}
			}
		}
		System.out.println("Ascending order ");
		System.out.println(Arrays.toString(a));
		
		//To Desending order 
		for(int j =0; j<a.length; j++)
		{
			for(int k = j+1; k<a.length; k++)
			{
				if(a[j] < a[k])
				{
					int temp = a[j];
					a[j] = a[k];
					a[k] = temp;
				}
			}
		}
		System.out.println("Descending order ");
		System.out.println(Arrays.toString(a));

	}

}
