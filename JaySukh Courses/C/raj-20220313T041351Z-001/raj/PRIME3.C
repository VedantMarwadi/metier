//to print prime no between 1 to 200
#include<stdio.h>
#include<conio.h>
void main()
{
	int no,i,flag;
	int s,e;

	clrscr();
	printf("Enter starting and end value");
	scanf("%d%d",&s,&e);
	for(no=s;no<=e;no++)
	{
		flag=0;
		for(i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=1;
				break;

			}
		}
		if(flag==0)
			printf("%d\t",no);
	}
	getch();

}







