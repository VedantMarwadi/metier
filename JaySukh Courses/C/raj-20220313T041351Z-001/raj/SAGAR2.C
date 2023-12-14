//to check the given no	is armstrong or not
#include<stdio.h>
#include<conio.h>
#include"sagar.h"
int isarmstrong(int);

void main()
{
	long int no;
	int r;
	clrscr();
	printline();
	printf("Enter any no");
	scanf("%ld",&no);
	printanychar('*');
	printline();
	r=isarmstrong(no);
	if(r==1)
		printf("It is armstrong");
	else
		printf("It is not an armstrong");
	getch();

}
int isarmstrong(int no)
{
	int temp,sum=0,rem;

	temp=no;
	while(no>0)
	{
		rem=no%10;
		sum=sum+(rem*rem*rem);
		no=no/10;
	}
	if(sum==temp)
		return 1;
	else
		return 0;
}








