//to check the given no is prime or not
#include<stdio.h>
#include<conio.h>
int isprime(int);
void main()
{
	int no,flag;

	clrscr();
	printf("Enter any no");
	scanf("%d",&no);
	flag=isprime(no);

	if(flag==1)
		printf("it is prime");
	else
		printf("it is not prime");

	getch();



}
int isprime(int no)
{
	int flag=0,i;

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