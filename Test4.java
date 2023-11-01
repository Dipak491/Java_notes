package Test;
import java.util.*;

public class Test4 
{
	
	void Diff(int x, int y)
	{
		int sum =0;
		int sum2 = 0;
		int sub;
		
		for(int i =1; i<=x;i++)
		{
			if(i%y!=0)
			{
				sum = sum+i;
				
				
			}
			else
			{
				sum2 = sum2+i;
				
			}

		}
		System.out.println("not divisible by x Sum is "+sum);
		System.out.println("Divisible by x sub is "+sum2);
		sub = sum -sum2;
		
		System.out.println(sub);
	}

	public static void main(String[] args) 
	{
		int n = 0;
		int m =0;
		Scanner sc = new Scanner(System.in);
	
		 
		 Test4 obj = new Test4();
		 
		 obj.Diff(20,4);
	}

}
