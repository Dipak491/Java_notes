package com.loops;
import java.util.*;


//series 0 1 3 6 10 15 21......
public class SeriesDemo {
	
	static void Number(int num)
	{
		int i = 0;
		int res =0;
		
		
		for(i= 0; i<num; i++)
		{
			res = res+i;
			System.out.print(" "+res);
		}
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		
		Number(num);
	}

}
