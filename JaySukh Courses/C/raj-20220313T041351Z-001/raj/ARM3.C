//to check the given no is armstrong or not by using function
#include<stdio.h>
#include<conio.h>
int isarmstrong(int);

void main()
{

	int no,r;
	clrscr();
	printf("Enter any no");
	scanf("%d",&no);
	r=isarmstrong(no);
	if(r==1)
		printf("it is armstrong no");
	else
		printf("it is not an armstrong no");

	getch();


}
int isarmstrong(int no)
{
	int temp,rem,sum=0;

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





