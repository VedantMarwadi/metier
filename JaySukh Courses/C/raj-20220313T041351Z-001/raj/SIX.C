//write a program to calculate the totl and percentage of student
#include<stdio.h>
#include<conio.h>
void main()
{
	int maths,sci,eng,ss,computer,total;
	float per;
	clrscr();
	printf("Enter your maths marks");
	scanf("%d",&maths);
	printf("Enter your science marks");
	scanf("%d",&sci);
	printf("Enter your english marks");
	scanf("%d",&eng);
	printf("Enter your ss marks");
	scanf("%d",&ss);
	printf("Enter your computer marks");
	scanf("%d",&computer);
	total=maths+sci+eng+ss+computer;
	per=total/5.0;
	printf("Maths = %d\n",maths);
	printf("Science = %d\n",sci);
	printf("English = %d\n",eng);
	printf("Social Science = %d\n",ss);
	printf("Computer = %d\n",computer);
	printf("Total = %d\n",total);
	printf("Percentage = %f\n",per);



	getch();
}