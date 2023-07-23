#include<stdio.h>
  
void Digit(int No1)
{
    int rem=0;
    int cnt =0;

    while(No1!=0)
    {
        rem = No1%10;
        //printf("%d\n",rem);
        cnt = cnt+rem;
        No1 = No1/10;
    }
    printf("%d\n",cnt);
}

int main()
{
    int Value1=1235;
    Digit(Value1);
    //Print();
    return 0;
}