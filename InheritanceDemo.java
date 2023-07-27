package com.corejava;

class Parent
{
	int num1=10;  //member
	int num2=20;
	int sum;
	
	void add()
	{
		sum = num1 + num2;
		System.out.println(sum );
	}
}
public class InheritanceDemo extends Parent 
{
	
	public static void main(String[] args)
	{
		InheritanceDemo obj = new InheritanceDemo();
		obj.add();
		

	}

}
