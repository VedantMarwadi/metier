//concate and copy
#include<stdio.h>
#include<conio.h>
void main()
{
	char str1[50],str2[50];
	int i,l,j;
	char temp;

	clrscr();
	printf("Enter first string");
	gets(str1);
	printf("Enter second string");
	gets(str2);

	for(l=0;str1[l]!='\0';l++);

	for(i=0,j=l;str2[i]!='\0';i++,j++)
	{
		str1[j]=str2[i];
	}
	str1[j]='\0' ;
	puts(str1);

	for(i=0;str2[i]!='\0';i++)
	{
		str1[i]=str2[i];
	}
	str1[i]='\0';
	puts(str1);
	getch();
}