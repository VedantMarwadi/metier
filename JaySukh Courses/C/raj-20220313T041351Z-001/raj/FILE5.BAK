////formated i/o
#include<conio.h>
#include<stdio.h>
void main()
{
	FILE *p;
	char a,b,i;

	clrscr();
	p=fopen("temp.c","w");
	printf("Enter five char values");
	for(i=0;i<5;i++)
	{
		fflush(stdin);
		scanf("%c",&a);
		fprintf(p,"%c",a);

	}
	fclose(p);
	p=fopen("temp.c","r");
	for(i=0;i<5;i++)
	{
		fscanf(p,"%c",&b);
		printf("%c\t",b);

	}


	getch();

}