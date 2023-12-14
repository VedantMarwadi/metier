#include<stdio.h>
#include<conio.h>

void main()
{
	int no;

	int i;
	int a[no];
	printf("how may values you want to store");
	scanf("%d",&no);


	clrscr();
	for(i=0;i<no;i++)
	{
		printf("Enter value");
		scanf("%d",p+i);
	}
	for(i=0;i<no;i++)
	{

		printf("%d\t",*(p+i));
	}
	printf("Enter how many values you want to store");
	scanf("%d",&no);

	realloc(p,no*2);
	for(i=0;i<no;i++)
	{
		printf("Enter value");
		scanf("%d",p+i);
	}
	for(i=0;i<no;i++)
	{

		printf("%d\t",*(p+i));
	}


	getch();

}