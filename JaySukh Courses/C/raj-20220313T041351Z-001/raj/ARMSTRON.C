//to check the given no	is armstrong or not
#include<stdio.h>
#include<conio.h>

void main()
{
	long int no,temp;
	int sum=0,rem;
	clrscr();
	printf("Enter any no");
	scanf("%ld",&no);
	temp=no;
	while(no>0)
	{
		rem=no%10;
		sum=sum+(rem*rem*rem);
		no=no/10;
	}
	if(sum==temp)
		printf("It is an armstrong no");
	else
		printf("It is not an armstrong no");

	getch();

}
/*sum=0,27,152,153
rem=3,5,1
no=153,15,1,0
temp=153*/








