package com.outerinnerclass;


interface Ifclass
{
	abstract void get();
	abstract void set();
}




public class InterfaceAnony {

	public static void main(String[] args) 
	{
		Ifclass iobj = new Ifclass()
				{

					@Override
					public void get() 
					{
						System.out.println("Get method");
						
					}

					@Override
					public void set() {
						
						System.out.println("Set method ");
					}
					
				};
				iobj.set();
				iobj.get();

	}

}
