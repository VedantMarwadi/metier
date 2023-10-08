//to print the fibbonacci series
//0,1,1,2,3,5,8,13
#include<stdio.h>
#include<conio.h>
void main()
{

	long int i=0,j=1,k;
	int no,m;
	clrscr();
	printf("Enter no of terms");
	scanf("%d",&no);
	printf("%ld\t%ld",i,j);
	for(m=1;m<=no-2;m++)
	{
		k=i+j;
		printf("\t%ld\t",k);
		i=j;
		j=k;

	}

	getch();

}