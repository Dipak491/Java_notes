package com.outerinnerclass;

abstract class Person
{
	abstract void eat();
}


public class TestAnonymouseInner 
{

	public static void main(String[] args) 
	{
		Person p = new Person()
		{
			void eat()
			{
				System.out.println("Abtract class we write when we create obj of abstract class");
			}
		};
	p.eat();
	}

}
 