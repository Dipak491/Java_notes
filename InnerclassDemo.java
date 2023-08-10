package com.outerinnerclass;

class Outerclass
{
	private int data = 20;
	
	class Innerclass
	{
		void show()
		{
			System.out.println("Private member of outerclass "+data);
		}
	}
}


public class InnerclassDemo 
{
	public static void main(String[] args)
	{
		Outerclass obj  = new Outerclass();
		//obj create for inner class  
		Outerclass.Innerclass iobj = obj.new Innerclass();
		
		//outerclass name . innerclass name objname = outerclass objname. new innerclassname();
		
		iobj.show();

	}

}
