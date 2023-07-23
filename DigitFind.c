#include<Stdio.h>


void Find(int No, int number )
{
	int iDigit =0;
	//flag =false;

	while(No !=0)
	{
		iDigit = No%10;
		if(iDigit == number)
		{
			printf("Number is present");
			break;
		}
	}

	// if(flag == true)
	// 	{
	// 		printf("Number is present");
	// 	}
	// 	else
	// 	{
	// 		printf("Number is not present");
	// 	}
}
int  main()
{
	int iNo = 0;
	printf("Enter a number\n");
	scanf("%d",&iNo);

	int Num = 0;
	printf("Enter the number that you want find\n");
	scanf("%d",&Num);

	Find(iNo,Num);
	return 0;
}