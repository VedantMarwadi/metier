//continue
#include<stdio.h>
#include<conio.h>
void main()
{
	int i;
	clrscr();
	for(i=1;i<=10;i++)
	{
		printf("%d",i);
		if(i==6)
		{
			printf("Hi\t");
			continue;
		}
		printf("hello\t");


	}
	getch();

}
//1  Hello 2 hello 3 hello 4 hello 5 hello 6 hi 7 heloo 8 hello 9 hello 10 hello
//i=1