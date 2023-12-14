#include<stdio.h>
#include<conio.h>
void main()
{
	int maths,sci,eng,total;
	float per;
	clrscr();
	printf("Enter Maths,Science and English Marks respectively");
	scanf("%d%d%d",&maths,&sci,&eng);
	total=maths+sci+eng;
	per=total/3.0;
	printf("Maths = %d\nScience = %d\nEnglish = %d\n",maths,sci,eng);
	printf("Total = %d\nPercentage = %f\n",total,per);
	getch();
}