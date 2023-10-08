//single character by character reading and writing
//copy one file into other file
#include<iostream.h>
#include<conio.h>
#include<fstream.h>
void main()
{
	int i=0;
	char ch;
	ifstream in;
	ofstream out;
	clrscr();
	in.open("temp1.cpp");
	out.open("jay2.txt");
	while(in)
	{
		in.get(ch);
		out.put(ch);
		cout<<ch;
		i++;
	}
	in.close();
	cout<<i<<endl;
	getch();

}