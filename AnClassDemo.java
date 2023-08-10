package com.outerinnerclass;

abstract class Abclass
{
	abstract void get();
	abstract void set();

}



public class AnClassDemo 
{	
	public static void main(String[] args) 
	{
		Abclass aobj = new Abclass()
				{
					void get()
					{
					System.out.println("Get method");	
					}
					void set()
					{
						System.out.println("Set method");
					}
				};
				
				aobj.get();
				aobj.set();

	}

}
