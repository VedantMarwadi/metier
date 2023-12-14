#include<stdio.h>
#include<conio.h>
typedef int mark;
typedef float per;
void main()
{
	mark s1=45,s2=67,s3=77,total;
	per p;
	int r=10;
	float perce=34.56;

	clrscr();
	total=s1+s2+s3;
	p=total/3.0;
	printf("Total = %d\n",total);
	printf("Percentage= %.2f\n",p);
	printf("Int value %d\n",r);
	printf("float value %f\n",perce);

	getch();

}