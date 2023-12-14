#include<conio.h>
#include<stdio.h>
void main()
{
	FILE *p;
	char ch;
	int count=0;
	clrscr();
	p=fopen("arr1.c","r");
	if(p==NULL)
		printf("File does not exists");
	ch=fgetc(p);
	while(ch!=EOF)
	{
		if(isdigit(ch))
		{
			printf("%c\t",ch);
			count++;
		}
		ch=fgetc(p);
	}
	fclose(p);
	printf("No of digits in the file are %d\n",count);
	getch();
}