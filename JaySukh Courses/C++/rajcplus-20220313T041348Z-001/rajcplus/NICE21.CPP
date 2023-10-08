#include<iostream.h>
#include<conio.h>
#define size 4
class matrix
{
	private:
		int a[size][size];
	public:
		void read()
		{
			for(int i=0;i<size;++i)
			{
				for(int j=0;j<size;++j)
				{
					cin>>a[i][j];
				}
			}
		}
		void show()
		{
			for(int i=0;i<size;++i)
			{
				for(int j=0;j<size;++j)
				{
					cout<<a[i][j]<<"\t";
				}
				cout<<"\n";
			}
		}
		matrix operator * (matrix t)
		{
			matrix temp;
			for(int i=0;i<size;++i)
			{
				for(int j=0;j<size;++j)
				{
					temp.a[i][j]=0;
					for(int k=0;k<size;++k)
					{
						temp.a[i][j]+=a[i][k]*t.a[k][j];
					}
				}
			}
			return temp;
		}
};
void main()
{
	clrscr();
	matrix m1,m2,m3;
	cout<<"Enter first matrix\n";
	m1.read();
	cout<<"Enter second matrix\n";
	m2.read();
	cout<<"Resultant matrix\n";
	m3=m1*m2;
	m3.show();
	getch();
}
