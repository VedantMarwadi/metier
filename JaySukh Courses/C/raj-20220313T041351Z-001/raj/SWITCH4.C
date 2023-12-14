//to print the weekdays
#include<stdio.h>
#include<conio.h>
void main()
{
	int no;
	clrscr();
	printf("Enter any no");
	scanf("%d",&no);
	switch(no)
	{
		default:printf("Invalid Day");
		       break;
		case 1:printf("It is Monday");
		       break;
		case 2:printf("It is Tuesday");
		       break;
		case 3:printf("It is Wednesday");
		       break;
		case 4:printf("It is Thursday");
		       break;
		case 5:printf("It is Friday");
		       break;
		case 6:printf("It is Saturday");
		       break;
		case 7:printf("It is Sunday");
		       break;


	}

	getch();

}