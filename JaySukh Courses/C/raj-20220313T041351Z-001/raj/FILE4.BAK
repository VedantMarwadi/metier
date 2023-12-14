//
//formated i/o
#include<conio.h>
#include<stdio.h>
void main()
{
	FILE *p;
	float a,b,i;

	clrscr();
	p=fopen("temp.c","w");
	printf("Enter five float values");
	for(i=0;i<5;i++)
	{
		scanf("%f",&a);
		fprintf(p,"%.2f\t",a);

	}
	fclose(p);
	p=fopen("temp.c","r");
	for(i=0;i<5;i++)
	{
		fscanf(p,"%f",&b);
		printf("%.2f\t",b);


	}
	fclose(p);


	getch();





}