#include<iostream.h>
#include<conio.h>
#include<fstream.h>
void main()
{
	ifstream in("jay.txt");
	clrscr();
	cout<<in.tellg()<<endl;
	in.seekg(10,ios::beg);
	cout<<in.tellg()<<endl;
	in.seekg(10,ios::cur);
	cout<<in.tellg()<<endl;
	in.seekg(-10,ios::cur);
	cout<<in.tellg()<<endl;
	in.seekg(0,ios::end);
	cout<<"File zise "<<in.tellg()<<endl;
	getch();


}