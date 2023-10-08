//use of string function
#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{

	int l;
	char *str1,*str2;
	clrscr();
	printf("Enter first string");
	gets(str1);
	printf("Enter second string");
	gets(str2);

	l=strcmp(str1,str2);
	if(l>0)
		printf("str1>str2\n");
	else if(l<0)
		printf("str1<str2\n");
	else
		printf("both are equal\n");

	strcpy(str1,str2);
	puts(str1);

	strcat(str1,str2);
	puts(str1);
	getch();

}