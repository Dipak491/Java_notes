import java.util.*;
//2,3,5,7,11 
class PrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number ");
		int n = sc.nextInt();

			boolean isPrime = true;
		if(n==2)
		{
			System.out.print("n is PrimeNumber");
		}
		else 
		{

		 for(int i = 2; i<= n-1;i++)
		 {
		 	if(n%i==0)
		 	{
		 		isPrime = false;
		 	}
		 }

		}
		
		 if(isPrime == true)
		 {
		 	System.out.println("n is prime");
		 }
		 else 
		 {
		 	System.out.print("n is not prime");
		 }
		
	}
}