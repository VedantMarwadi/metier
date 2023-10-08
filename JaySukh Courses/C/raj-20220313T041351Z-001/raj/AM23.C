//to check the given no is armstrong or not
#include<stdio.h>
#include<conio.h>
int isarmstrong(int);

void main()
{
	int no;
	int r;
	clrscr();
	printf("Enter any no");
	scanf("%d",&no);
	r=isarmstrong(no);
	if(r==1)
		printf("it is an armstrong no");
	else
		printf("it is not an armstrong no");

	getch();
	//printf("%d",r);
}
int isarmstrong(int no)
{
	int sum=0,rem,temp;
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






