//formated i/o
#include<conio.h>
#include<stdio.h>
void main()
{
	FILE *p;
	int a,b,i;

	clrscr();
	p=fopen("temp.c","w");
	printf("Enter five int values");
	for(i=1;i<=5;i++)
	{
		scanf("%d",&a);
		fprintf(p,"%d ",a);

	}
	fclose(p);
	p=fopen("temp.c","r");
	for(i=1;i<=5;i++)
	{
		fscanf(p,"%d",&b);
		printf("%d\t",b);

	}
	fclose(p);
	getch();

}