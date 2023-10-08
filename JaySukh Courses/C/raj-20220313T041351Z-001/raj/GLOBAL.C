//global variable
#include<stdio.h>
#include<conio.h>
void fun1();
void fun2();
void fun3();
int a=1000; //global variable
void main()
{
	clrscr();
	printf("main global %d\n",a);
	a=10; //gloabl variable
	printf("main global %d\n",a);
	fun1();
	fun2();
	fun3();
	printf("main global %d\n",a);
	getch();


}
void fun1()
{
	a=100; // global
	printf("Fun1 gloabal = %d\n",a);
}
void fun2()
{
	int a=1000;//local to fun2
	printf("Fun2 local = %d\n",a);
}
void fun3()
{
	a=10000;//local to fun3
	printf("Fun3 global = %d\n",a);
}

