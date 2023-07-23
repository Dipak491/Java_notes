
#include<stdio.h>
  
void Digit(int No1)
{
    int rem=0;
    int cnt =0;

    while(No1!=0)
    {
        rem = No1%10;
        
        if(rem ==6)
        {
        	break;
        }
        No1 = No1/10;
    }
if(rem ==5)
{
	printf("its present ");
}
else
{
	printf("No present");
}
}

int main()
{
    int Value1=1235;
    Digit(Value1);
    //Print();
    return 0;
}