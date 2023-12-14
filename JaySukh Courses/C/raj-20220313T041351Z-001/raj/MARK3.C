#include<stdio.h>
#include<conio.h>
void main()
{
	int maths,sci,eng,physics,biology;
	clrscr();
	printf("Enter maths,sci,eng,physics and biology marks respectively");
	scanf("%d%d%d%d%d",&maths,&sci,&eng,&physics,&biology);
	printf("Maths = %d\nScience = %d\nEnglish = %d\nPhysics = %d\nBiology = %d",maths,sci,eng,physics,biology);
	getch();

}