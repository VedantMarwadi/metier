#include<stdio.h>
#include<conio.h>
void printline();
void printanychar(char);
int sum3(int,int,int);
void main()
{
	int a,b,c,d,i;
	char ch;
	clrscr();
	printline();
	printanychar('*');


	printf("Enter three int values");
	scanf("%d%d%d",&a,&b,&c);
	printline();
	printanychar('#');

	d=sum3(a,b,c);
	printf("The addition is %d",d);
	printline();
	printanychar('#');
	getch();
	//printf("%d",a);
}
void printline()
{
	int i;
	printf("\n");
	for(i=1;i<=80;i++)
	{
		printf("-");
	}
}
void printanychar(char ch)
{
	int i;
	printf("\n");
	for(i=1;i<=80;i++)
	{
		printf("%c",ch);
	}
}
int sum3(int p,int q,int r)
{
	int s;
	s=p+q+r;
	return s;
}

