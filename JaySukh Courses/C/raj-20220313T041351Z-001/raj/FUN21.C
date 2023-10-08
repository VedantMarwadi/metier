//to do the sum of digit of a given no
#include<stdio.h>
#include<conio.h>
int sumofdigit(long int);
void main()
{
	long int no;
	int sum;
	clrscr();
	printf("Enter any no");
	scanf("%ld",&no);
	sum=sumofdigit(no);
	printf("The sum of digit is %d",sum);
	getch();
}
int sumofdigit(long int no)
{
	int rem,sum=0;
	while(no>0)
	{
		rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	return sum;
}

/*no=1234,123,12,1,0
sum=0,4,7,9,10
rem=4,3,2,1*/

