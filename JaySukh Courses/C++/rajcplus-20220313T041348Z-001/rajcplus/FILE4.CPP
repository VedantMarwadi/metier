#include<iostream.h>
#include<conio.h>
#include<fstream.h>
void main()
{
	int i;
	ofstream out;
	clrscr();
	out.open("jay3.txt");
	out<<"skjdgsdg sdjgksdmngdbsb"<<endl;
	out<<"jsdnsdgn sgsdgdsklj"<<endl;
	out<<"sdjgjsdgsdj ndgjklsndjkgdsg dsnn"<<endl;
	out.close();

	ifstream in;
	char ch[100];
	in.open("jay3.txt");
	while(in)
	{
		in.getline(ch,50,'\n');
		cout<<ch<<endl;
	}
	in.close();
	getch();


}