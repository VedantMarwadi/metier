//to check the given no is prime or not
#include<stdio.h>
#include<conio.h>
void main()
{
	int no,i,count=0;
	clrscr();
	printf("Enter any no");
	scanf("%d",&no);
	for(i=1;i<=no;i++)
	{
		if(no%i==0)
			count++;

	}
	if(count==2)
		printf("it is prime");
	else
		printf("it is not prime");
	getch();
}