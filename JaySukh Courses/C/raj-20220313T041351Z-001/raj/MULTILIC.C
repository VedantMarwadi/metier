//to print the mutiplication table of  a given no
#include<stdio.h>
#include<conio.h>
void main()
{
	int no,i;

	clrscr();
	printf("Enter any no");
	scanf("%d",&no);
	for(i=1;i<=10;i++)
	{
		printf("%d * %d = %d\n",no,i,(no*i));
	}
	getch();

}