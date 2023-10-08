//To check the given year is leap or not																//to check the given year is leap or not
#include<stdio.h>
#include<conio.h>
void main()
{
	int year;
	clrscr();
	printf("Enter any year");
	scanf("%d",&year);
	if((year%4==0 && year%100!=0)||	(year%400==0))
		printf("it is a leap year");
	else
		printf("it is not a leap year");




	getch();

}