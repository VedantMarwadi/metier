//to check the given character is wovel or not
#include<stdio.h>
#include<conio.h>
void main()
{
	char ch;
	clrscr();
	printf("Enter any character");
	scanf("%c",&ch);
	switch(ch)
	{
		case 'a':printf("It is wovel");
			break;
		case 'e':printf("It is wovel");
			break;
		case 'i':printf("It is wovel");
			break;
		case 'o':printf("It is wovel");
			break;
		case 'u':printf("It is wovel");
			break;
		default:printf("It is not a wovel");
			break;

	}
	getch();

}