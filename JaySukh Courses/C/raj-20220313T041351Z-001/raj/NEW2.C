//to check the given no	is armstrong or not
#include<stdio.h>
#include<conio.h>
int isarmstrong(long int);

void main()
{
	long int no;
	int r;
	clrscr();
	printf("Enter any no");
	scanf("%ld",&no);
	r=isarmstrong(no);
	if(r==1)
		printf("it is an armstrong");
	else
		printf("it is not an armstrong");
	getch();

}
int isarmstrong(long int no)
{
	long int temp;
	int rem,sum=0;
	temp=no;
	while(no>0)
	{
		rem=no%10;
		sum=sum+(rem*rem*rem);
		no=no/10;
	}
	if(sum==temp)
		return 1;
	else
		return 0;

}








