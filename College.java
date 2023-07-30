
import java.util.*;



class College
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one option 1 for student 2 for Teacher");
		int i =sc.nextInt();

		if (i==1)
		{
			Student sobj = new Student();
			sobj.Display();
			sobj.Sdata();
		}
		else if(i==2)
		{
			Teacher tobj = new Teacher();
			tobj.Display();
			tobj.Tdata();
		}
		
	}
}



class University
{
	Scanner sc = new Scanner(System.in);
	void Display()
	{

		String Uname = "RTMNU University";

		System.out.println("PLease enter your name ");
		String name = sc.next();

		System.out.println("Enter your City");
		String city = sc.next();

		System.out.println("WelCome to "+Uname +" "+ name);

	}
}

class Student extends University
{
	void Sdata()
	{


	System.out.println("Enter your id ");
	int id = sc.nextInt();

	System.out.println("Enter your branch CS  ME EE" );
	String branch = sc.next();

	switch(branch)
	{
	case "CS":
		System.out.println("Your academic fee is 90k");
		break;

	case "ME":
		System.out.println("Your academic fee is 1Lac");
		break;

	case "EE":
		System.out.print("Your academic fees is 80k");
		break;

	default:
		System.out.println("Enter valid choice  CS" +"," + "ME" +","+ "EE" );
	}
	}

}

class Teacher extends University
{
	void Tdata()
	{
		System.out.println("PLease choose Department CS" +"," + "ME" +","+ "EE");
	String dept = sc.next();

	switch(dept)
	{
	case "CS":
		System.out.println("Your Salary is  40k");
		break;

	case "ME":
		System.out.println("Your Salary is 50k");
		break;

	case "EE":
		System.out.println("Your Salary is  80k");
		break;

	default:
		System.out.println("Enter valid choice ");
	}


	}
}
	

