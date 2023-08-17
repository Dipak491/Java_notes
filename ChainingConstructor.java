package assessment1;

class Base
{
	Base()
	{
		this(8,8);
		System.out.println("Default Constructor");
	}
	
	Base(int len, int height)
	{
		int Area = len *height;
		System.out.println("Area of Rectangle is "+Area);
	}
	
	
}

class Derived extends Base
{
	Derived()
	{
		this(3);
		
		System.out.println("Derived class default constuctor ");
	}
	
	Derived(int a)
	{
		super();
		double area = 3.14*a*a;
		System.out.println("Area of circle is "+area);
	}
}

public class ChainingConstructor {

	public static void main(String[] args)
	{
		
		Derived d  = new Derived();
		
		

	}

}
