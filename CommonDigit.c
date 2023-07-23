#include<stdio.h>

int main()
{
	int Num1[] = {1,2,3};
	int Num2[] = {3,4,6};
	int Num3[] = {9,8,3};

	for(int i =0; i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			for(int k=0;k<3;k++)
			{
				if(Num1[i]==Num2[j] && Num2[j]==Num3[k])
				{
					printf("%d\n",Num1[i]);
				}
			}
		}
	}


	return 0;
}