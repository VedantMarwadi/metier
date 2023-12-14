#include<iostream.h>
#include<conio.h>
#include<fstream.h>
void main()
{
	ifstream in;
	ofstream out;
	clrscr();
	out.open("jay1.txt");
	out<<"Shirts "<<650<<endl;
	out<<"Trousures "<<1000<<endl;
	out<<"Tshirts "<<450<<endl;
	out<<"Shirts "<<650<<endl;
	out<<"Trousures "<<1000<<endl;
	out<<"Tshirts "<<450<<endl;
	out<<"Tshirts "<<450<<endl;
	out<<"Shirts "<<650<<endl;
	out<<"Trousures "<<1000<<endl;
	out<<"Tshirts "<<450<<endl;

	out.close();

	char str[100];
	int price;
	in.open("jay1.txt");
	in>>str>>price;

	while(!in.eof())
	{

		cout<<str<<"\t"<<price<<endl;
		in>>str>>price;

	}

	in.close();
	getch();

}