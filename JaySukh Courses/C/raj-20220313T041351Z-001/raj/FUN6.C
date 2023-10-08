//pass by value or pass by reference
#include<stdio.h>
#include<conio.h>
void swapv(int,int);
void swapr(int*,int*);
void main()
{
	int a,b;
	clrscr();
	printf("Enter two values");
	scanf("%d%d",&a,&b);
	swapv(a,b);
	printf("a = %d\tb = %d\n",a,b);
	swapr(&a,&b);
	printf("a = %d\tb = %d\n",a,b);

	getch();

}
void swapv(int c,int d)
{
	int temp;
	temp=c;
	c=d;
	d=temp;

}
void swapr(int *c,int *d)
{
	int temp;
	temp=*c;
	*c=*d;
	*d=temp;

}

