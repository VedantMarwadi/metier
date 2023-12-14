//to overload + opearator for string concatenation
//<opearator to compare two string
#include<iostream.h>
#include<conio.h>
#include<string.h>

class string
{
	char *str;
	public:
	string()
	{
		*str=NULL;

	}
	string(char *ch)
	{
		int l=strlen(ch);
		str=new char[l+1];
		strcpy(str,ch);
	}
	void show()
	{
		cout<<"str = "<<str<<endl;

	}
	string operator+(string s2)
	{
		string temp;
		int l1=strlen(str);
		int l2=strlen(s2.str);
		temp.str=new char[l1+l2+2];
		strcpy(temp.str,str);
		strcat(temp.str," ");
		strcat(temp.str,s2.str);
		return temp;
	}
	int operator<(string s2)
	{
		int l1=strlen(str);
		int l2=strlen(s2.str);
		if(l1<l2)
			return 1;
		else
			return 0;
	}



} ;
void main()
{
	clrscr();
	string s1("jaysukh");
	string s2("patel");
	string s3;
	s3=s1+s2;
	s1.show();
	s2.show();
	s3.show();
	if(s1<s2)
		cout<<"length of s1 is less than s2"<<endl;
	else
		cout<<"length of s1 is greterthan s2"<<endl;

	getch();
}