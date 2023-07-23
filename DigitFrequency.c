
#include<stdio.h>
  
int Frequency(int No1)
{
    int rem=0;
    int cnt =0;

    while(No1!=0)
    {
        rem = No1%10;
        
        if(rem ==1)
        {
        	cnt++;
        }
        No1 = No1/10;
    }
    return cnt;
}

int main()
{
    int Value1=1215;
    int iret =0;

    iret = Frequency(Value1);
    printf("Frequency is %d",iret);
    //Print();
    return 0;
}