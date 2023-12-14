//to check the given no is positive negative or zero
#include<stdio.h>
#include<conio.h>
void main()
{
	int no;
	clrscr();
	printf("Enter any no");
	scanf("%d",&no);
	if(no>0)
		printf("It is positive no");
	else if(no<0)
		printf("it is negative no");
	else
		printf("it is zero");


	getch();

}