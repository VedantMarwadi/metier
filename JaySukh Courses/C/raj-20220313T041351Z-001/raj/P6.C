//to count the no off odd and no of even no from array by using pointer
#include<stdio.h>
void main()
{
	int a[10],i,ceven=0,codd=0;
	int *p;
	clrscr();
	p=a;
	printf("Enter any 10 int values");
	for(i=0;i<10;i++)
	{
		printf("Enter value");
		scanf("%d",p+i);
		if(*(p+i)%2==0)
			ceven++;
		else
			codd++;

	}
	printf("No of odd values are %d\n",codd);
	printf("No of even values are %d\n",ceven);
	getch();


}