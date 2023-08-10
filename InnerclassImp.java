package com.outerinnerclass;

class Outerclass1
{
	void outermethod()
	{
		System.out.println("Outerclass method");
		
		class Innerclass
		{
			void innermethod()
			{
				System.out.println("Inner class method inside outer method ");
			}
		}
		Innerclass iobj = new Innerclass();
		iobj.innermethod();
	}
}


public class InnerclassImp 
{
	public static void main(String[] args) 
	{
		Outerclass1 obj = new Outerclass1();
		obj.outermethod();
	}

}
