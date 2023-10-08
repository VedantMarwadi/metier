//to find the total and percentage of student
#include<stdio.h>  //it is pre processor directive
#include<conio.h>  //to incloude any file
void main()
{
	int maths,sci,eng,total;
	float per;
	char ch;
	clrscr();
	do
	{
		printf("Enter maths sci and eng marks respectively");
		scanf("%d%d%d",&maths,&sci,&eng);
		total=maths+sci+eng;
		per=total/3.0;
		printf("Maths = %d\nScience = %d\nEnglish = %d\n",maths,sci,eng);
		printf("Total = %d\nPercentage = %.2f",total,per);
		printf("Do u want another result(y/n)");
		fflush(stdin);
		scanf("%c",&ch);
	}
	while(ch=='y' || ch=='Y');
	getch();

}