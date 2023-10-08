#include<iostream>
using namespace std;

int  main()
{
	int a,b,c;

	cout<<"Enter two int values";
	cin>>a>>b;
	try
	{
		if(b==0)
			throw b;
		else
		{
			c=a/b;
		}
		cout<<"Division is "<<c<<endl;
	}
	catch(int e)
	{
		cout<<"division by zero "<<e<<endl;
	}
	cout<<"hello"<<endl;
	cout<<"hi"<<endl;
	return 0;
}
