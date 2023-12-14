//
#include<iostream.h>
#include<conio.h>
#include<fstream.h>
void main(int argc,char *argv[])
{
	ifstream in;
	ofstream out;
	char ch;
	clrscr();
	in.open(argv[1]);
	out.open(argv[2]);
	in.get(ch);
	while(!in.eof())
	{

		out.put(ch);
		cout<<ch;
		in.get(ch);

	}
	in.close();
	out.close();
	getch();

}