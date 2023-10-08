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

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':printf("It is wovel\n");
			 break;
		default :printf("It is not a wovel\n");


	}

	getch();

}