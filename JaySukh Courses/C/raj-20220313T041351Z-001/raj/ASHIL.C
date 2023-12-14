//to check the given no is prime or not
#include<stdio.h>
#include<conio.h>
int isprime(int);
void main()
{
	int no,r;

	clrscr();
	printf("Enter any no");
	scanf("%d",&no);
	r=isprime(no);
	if(r==1)
		printf("It is prime");
	else
		printf("It is not prime");


	getch();

}
int isprime(int no)
{
	int i,flag=0;

	for(i=2;i<no;i++)
	{
		if(no%i==0)
		{
		       flag=1;
		       break;

		}
	}
	if(flag==0)
		return 1;
	else
		return 0;

}