#include<iostream>
using namespace std;

void fun(int p)
{
	if(p==1)
   	throw p;
   else if(p==2)
   	throw 12.0;
   else if(p==3)
   	throw 'A';
   else
   	throw "jay";

}
int main()
{
	int a;
	cout<<"Enter one value";
   cin>>a;
   try
   {
   	fun(a);
   }
   catch(int p)
   {
   	cout<<"int value catched"<<p<<endl;
   }
    catch(char p)
   {
   		cout<<"char value catched"<<p<<endl;
   }
   catch(float p)
   {
        cout<<"float value catched"<<p<<endl;
   }

   catch(...)
   {
        cout<<"string value catched"<<endl;
   }
   cout<<"hello"<<endl;
   cout<<"Hi"<<endl;
   return 0;
}
