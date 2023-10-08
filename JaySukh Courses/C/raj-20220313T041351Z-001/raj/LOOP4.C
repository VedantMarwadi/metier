//to check the given no is odd or even
#include<stdio.h>
#include<conio.h>
void main()
{
	int no;
	char ch;
	clrscr();
	do
	{
		printf("Enter any no");
		scanf("%d",&no);
		if(no%2==0)
		{
			printf("it is even no");
		}
		else
		{
			printf("it is odd no");
		}
		printf("do u want to continu(y/n)");
		fflush(stdin);
		scanf("%c",&ch);

	}while(ch=='y' || ch=='Y');

	getch();

}