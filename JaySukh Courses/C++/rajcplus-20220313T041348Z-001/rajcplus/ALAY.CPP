#include<iostream.h>
#include<conio.h>
#include<fstream.h>
void main()
{
	ifstream in;
	ofstream o;
	clrscr();
	o.open("jay.txt");
	o<<"Hello how r u"<<endl;
	o<<"I am using file i/o"<<endl;
	o<<"It is used to read the file"<<endl;
	o<<"It is used to write into file"<<endl;
	o.close();
	char str[100];
	in.open("jay.txt");
	while(!in.eof())
	{
		in.getline(str,30,'\n');
		cout<<str<<endl;
	}
	in.close();
	getch();

}