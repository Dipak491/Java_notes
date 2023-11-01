package Test;

public class Test3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		

		int iRow = 4;
		int iCol = 4;
		
		for(int i =1; i<=iRow; i++)
		{
			for(int j = 1; j<=iCol; j++)
			{
				if((i==1)||(i==iRow))
				{
					System.out.print("%"+" ");
				}
				else 
				{
					System.out.print("*"+" ");
				}
			}System.out.println();
		}
	}
}
