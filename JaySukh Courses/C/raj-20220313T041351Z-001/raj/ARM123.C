//to check the given no is armstrong or not
#include<stdio.h>
#include<conio.h>

void main()
{

	int no1,no2,no,rem,sum,temp;
	clrscr();
	printf("Enter starting no");
	scanf("%d",&no1);
	printf("Enter end  no");
	scanf("%d",&no2);
	for(no=no1;no<=no2;no++)
	{
		temp=no;
		sum=0;
		while(temp>0)
		{
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
		if(sum==no)
			printf("%d\t",no);

	 }


	getch();
}




