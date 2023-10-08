//pointer arithmetic or pointer manipulation
#include<stdio.h>
#include<conio.h>
void main()
{

	int a=10,b=20,c,*p,*q;
	clrscr();
	p=&a;
	q=&b;
	c=*p + *q;
	printf("a = %d\tb = %d\tc = %d\n",a,b,c);
	(*p)++;
	(*q)++;
	c=*p + *q;
	printf("a = %d\tb = %d\tc = %d\n",a,b,c);
	++(*p);
	++(*q);
	c=*p + *q;
	printf("a = %d\tb = %d\tc = %d\n",a,b,c);
	*p=*q;  //a=b
	c=*p + *q;
	printf("a = %d\tb = %d\tc = %d\n",a,b,c);
	*p=10;
	*q=20;
	c=*p + *q;
	printf("a = %d\tb = %d\tc = %d\n",a,b,c);
	p=q;
	c=*p + *q;
	printf("a = %d\tb = %d\tc = %d\n",a,b,c);
	p=&a;
	c=*p + *q;
	printf("a = %d\tb = %d\tc = %d\n",a,b,c);
	getch();



}