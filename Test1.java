package Test;

//1 4 9 16....
public class Test1 
{
	void series()
	{
		int n = 5;
		int temp=1;
		for(int i = 0; i<n; i++)
		{
			temp = i*i;
			System.out.println(temp);
		}
	}

	public static void main(String[] args)
	{
		Test1 obj = new Test1();
		obj.series();
	}

}
