//do while loop
#include<stdio.h>
#include<conio.h>
void main()
{
	int i;
	int j;
	int k;
	clrscr();
	for(i=10,j=10,k=5;i<=15 && j>=6;i++,j--,k=k+i+j)
	{
		printf("Hello %d\n",i);

	}

	printf("I = %d\n",i);
	printf("J = %d\n",j);
	printf("K = %d\n",k);
	getch();

}







