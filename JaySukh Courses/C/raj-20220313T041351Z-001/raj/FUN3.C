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
		printf("It is an armstrong no");
	else
		printf("It is not an armstrong no");
	getch();

}
int isarmstrong(int no)
{
	int temp,sum=0,rem;

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