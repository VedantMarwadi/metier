//to find the area and circumference of the circle
#include<stdio.h>
#include<conio.h>


void main(int argc,char *argv[])
{
	int l;
	float radius,area,cir;

	clrscr();
	//printf("Enter Radius of the Circle");
	//scanf("%f",&radius);
	radius=atoi(argv[1]);
	area=3.14*radius*radius;
	cir=2*3.14*radius;


	printf("Radius = %.2f\n",radius);
	printf("Area = %.2f\n",area);
	printf("Circumference = %.2f\n",cir);

	getch();

}