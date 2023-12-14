//to check the given character is wovel or not
#include<stdio.h>
#include<conio.h>
void main()
{
	char ch;
	clrscr();
	printf("Enter any character");
	scanf("%c",&ch);
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'||
	ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		printf("it is wovel");
	else
		printf("it is not a wovel");


	getch();

}