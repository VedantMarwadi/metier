//to do the sum of digit of a given no
#include<stdio.h>
#include<conio.h>
int sumofdigit(long int);
void main()
{
	long int no,s;

	clrscr();
	printf("Enter any no");
	scanf("%ld",&no);
	s=sumofdigit(no);
	printf("The sum of digit is %d",s);
	getch();
}
int sumofdigit(long int no)
{
	int sum=0,rem;
	while(no>0)
	{
		rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	return sum;

}


