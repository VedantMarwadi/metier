//to find the maximum no from three nos by using ternary operator																									//to find the maximum no from three nos by use of ternary operator
#include<stdio.h>
#include<conio.h>
void main()
{
	int a,b,c,max;
	clrscr();
	printf("Enter three nos");
	scanf("%d%d%d",&a,&b,&c);
	max=(a>b)?(a>c ?a:c):(b>c ? b:c);
	printf("The maximum is %d",max);

	getch();


}