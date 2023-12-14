#include<iostream>
using namespace std;
void test(int p)
{
    cout<<"Hello"<<p<<endl;
	try
	{


		if(p>0)
			throw 1;
		else if(p<0)
			throw 'n';
		else
			throw 12.0;
	}
	catch(int p)
	{
		cout<<"it is positive "<<p<<endl;
	}
	catch(char ch)
	{
		cout<<"it is negative "<<ch<<endl;
	}
	catch(float p)
	{
		cout<<"it is zero "<<p<<endl;
	}
	catch(...)
	{
		cout<<"any other error "<<endl;

	}


	cout<<"Hi"<<endl;
	cout<<"Hello"<<endl;


}


int main()
{
    int no;
    test(23);
	test(-34);
	test(0);
	test('a');
	cout<<"Enter any no";
	cin>>no;
	cout<<no<<endl;
	test(no);
	return 0;
}
