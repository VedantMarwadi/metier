//to print no between 1 to 500 that is divisible 5 and 7
#include<stdio.h>
#include<conio.h>
void main()
{
	int no,stno,eno;
	clrscr();
	printf("Enter start no");
	scanf("%d",&stno);
	printf("Enter end no");
	scanf("%d",&eno);

	if(stno<eno)
	{
		for(no=stno;no<=eno;no++)
		{
			if(no%5==0 && no%7==0)
			{
				printf("%d\t",no);
			}
		}
	}
	else
		printf("Please enter valid start and end no");
	getch();

}
/*stno=1
endno=10
no=1,2,3,4,5,6,7,8,9,10 */