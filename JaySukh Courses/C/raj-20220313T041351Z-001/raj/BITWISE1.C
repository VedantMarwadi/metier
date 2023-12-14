//bitwise opearator
#include<stdio.h>
#include<conio.h>
void main()
{
	int a=6,b=7,c;
	clrscr();
	c= a&b;
	printf("bitwise and %d\n",c);
	c= a|b;
	printf("bitwise or %d\n",c);
	c= a^b;
	printf("bitwise ex or %d\n",c);
	c=a<<2;
	printf("bitwise left shift %d\n",c);
	c=a>>2;
	printf("bitwise right shift %d\n",c);
	printf("%d\n",a);
	c=!a;
	printf("bitwise not %d\n",c);
	c=~a;
	printf("bitwise complement %d\n",c);
	getch();


}