//use of string function
#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
	int l;
	char *str1;
	clrscr();
	printf("Enter any string");
	gets(str1);
	l=strlen(str1);
	printf("The lenght of string %s is %d\n",str1,l);
	strupr(str1);
	puts(str1);
	strlwr(str1);
	puts(str1);
	strrev(str1);
	puts(str1);
	getch();
}