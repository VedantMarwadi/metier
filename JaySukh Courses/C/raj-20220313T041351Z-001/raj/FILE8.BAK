//fseek ftell and rewind
#include<conio.h>
#include<stdio.h>
void main()
{
	long int pos;
	FILE *p;
	clrscr();
	p=fopen("fun2.c","r");
	pos=ftell(p);
	printf("file pointer at %ld\n",pos);

	fseek(p,20,0);
	pos=ftell(p);
	printf("file pointer at %ld\n",pos);

	fseek(p,-10,1);
	pos=ftell(p);
	printf("file pointer at %ld\n",pos);

	fseek(p,20,1);
	pos=ftell(p);
	printf("file pointer at %ld\n",pos);

	fseek(p,0,2);
	pos=ftell(p);
	printf("file size %ld\n",pos);

	rewind(p);

	pos=ftell(p);
	printf("file pointer at  %ld\n",pos);
	getch();





}