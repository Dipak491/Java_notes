package Test;

import java.util.Arrays;

public class Test2
{
	

	public static void main(String[] args) 
	{
		int arr[] = {1,2,3};
		int brr[] = {4,5,6};
		
		int crr[] = new int[arr.length + brr.length];		
		
		int k = 0;
		for(int i = 0; i<arr.length; i++)
		{
			crr[k++] = arr[i];
			crr[k++] = brr[i];
		}
		
		System.out.println(Arrays.toString(crr));

	}
}
