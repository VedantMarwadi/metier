#include<stdio.h>
#include<conio.h>

void main()
{
	int maths,sci,eng;
	clrscr();
	/*printf("Enter Maths marks");
	scanf("%d",&maths);
	printf("Enter Science marks");
	scanf("%d",&sci);
	printf("Enter English marks");
	scanf("%d",&eng);*/
	printf("Enter maths sci and eng marks respectively");
	scanf("%d%d%d",&maths,&sci,&eng);

	/*printf("Maths = %d\n",maths);
	printf("Sciecne = %d\n",sci);
	printf("English = %d",eng);*/
	printf("Maths = %d\nScience = %d\nEnglish = %d\n",maths,sci,eng);

	getch();
}
