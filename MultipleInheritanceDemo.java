package com.corejava;

class Base1
{
	void show()
	{
		System.out.println("BAse class");
	}
}

class Derived extends Base1
{
	void show1()
	{
		System.out.println("dervied class extends Base" );
	}
}

class Derived2 extends Derived
{
	void show2()
	{
		System.out.println("Derived2 from derived ");
	}
}

public class MultipleInheritanceDemo  extends Derived2
{
	void show3()
	{
		System.out.println("MULtipleInheitanceDemo extends Derived2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritanceDemo obj = new MultipleInheritanceDemo();
		obj.show();
		obj.show1();
		obj.show2();
		obj.show3();
	
		
	}

}
