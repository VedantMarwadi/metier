//commandline arguments
#include<iostream.h>
#include<conio.h>
#include<fstream.h>
void main(int argc,char *argv[])
{
	ifstream in;
	ofstream out;
	clrscr();
	out.open(argv[1]);
	out<<"Hello how r u"<<endl;
	out<<"I am using file i/o"<<endl;
	out<<"It is used to read the file"<<endl;
	out<<"It is used to write into file"<<endl;
	out.close();
	char str[100];
	in.open(argv[1]);
	while(!in.eof())
	{
		in.getline(str,50,'\n');
		cout<<str<<endl;
	}
	in.close();
	getch();

	}