//to find the area and circumference of the circle
#include<stdio.h>
#include<conio.h>
#define p printf
#define s scanf

void main()
{
	float radius,area,cir;

	clrscr();

	p("Enter Radius of the Circle");
	s("%f",&radius);


	area=3.14*radius*radius;
	cir=2*3.14*radius;
	p("Radius = %.2f\n",radius);
	p("Area = %.2f\n",area);
	p("Circumference = %.2f\n",cir);



	getch();



}