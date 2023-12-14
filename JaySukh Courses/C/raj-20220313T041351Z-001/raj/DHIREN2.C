#include<stdio.h>
#include<conio.h>
void main()
{
	int a=10,*p;
	float f=45.67,*q;
	char ch='d',*r;
	clrscr();
	p=&a;
	q=&f;
	r=&ch;
	printf("%u\t%d\t%u\t%d\n",&a,a,p,*p);
	printf("%u\t%.2f\t%u\t%.2f\n",&f,f,q,*q);
	printf("%u\t%c\t%u\t%c\n",&ch,ch,r,*r);
	getch();
}