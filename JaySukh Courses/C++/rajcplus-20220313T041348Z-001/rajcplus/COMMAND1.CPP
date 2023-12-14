#include<iostream.h>
#include<conio.h>
void main(int argc,char *argv[])
{
	clrscr();
	cout<<"no of arguments are "<<argc<<endl;
	int i;
	for(i=0;i<argc;i++)
	{
		cout<<"argument ="<<argv[i]<<endl;
	}
	getch();

}