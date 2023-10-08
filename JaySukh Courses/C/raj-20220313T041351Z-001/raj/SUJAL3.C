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
		printf("It is not an armstrong");

	getch();

}
int isarmstrong(long int no)
{
	long int temp;
	int sum=0,rem;
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
/*sum=0,27,152,153
rem=3,5,1
no=153,15,1,0
temp=153*/








