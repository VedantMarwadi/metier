//while loop
#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0;
	clrscr();
	while(i<=254)
	{
		printf("%d\t %c\n",i,i);
		i++;
		if(i==20|| i==40 || i==60 || i==80||i==100)
			getch();
	}

	getch();

}