#include<iostream.h>
#include<conio.h>
#include<string.h>
#include<stdio.h>
#define MAX_BOOKS 100
class book_list
{
	private:
		char author[MAX_BOOKS][20];
		char title[MAX_BOOKS][20];
		int price[MAX_BOOKS];
		char publisher[MAX_BOOKS][20];
		int stock_position;
	public:
		book_list()
		{
			stock_position=0;
		}
	void add_newbook()
		{
			fflush(stdin);
			cout<<"Author= ";
			cin>>author[stock_position];
			fflush(stdin);
			cout<<"Title= ";
			cin>>title[stock_position];
			fflush(stdin);
			cout<<"Price: ";
			cin>>price[stock_position];
			fflush(stdin);
			cout<<"Publisher= ";
			cin>>publisher[stock_position];
			stock_position++;
		}
	void show_list_authorwize()
		{
			int tempprice;
			char tempauthor[20];
			char temptitle[20];
			char temppublisher[20];
			for(int i=0;i<stock_position-1; ++i)

			{
				for(int j=i+1; j<stock_position; ++j)

				{
					if(strcmpi(author[i],author[j])>0)

					{
						strcpy(tempauthor,author[i]);
						strcpy(author[i],author[j]);
						strcpy(author[j],tempauthor);
						strcpy(temptitle,title[i]);
						strcpy(title[i],title[j]);
						strcpy(title[j],temptitle);
						tempprice=price[i];
						price[i]=price[j];
						price[j]=tempprice;
						strcpy(temppublisher,publisher[i]);
						strcpy(publisher[i],publisher[j]);
						strcpy(publisher[j],temppublisher);
					}
				}
			}
		cout<<"\tAuthorwise listing\n";
		for (i=0;i<stock_position;++i)
			{
				cout<<"Author: "<<author[i]<<endl;
				cout<<"Title: "<<title[i]<<endl;
				cout<<"Price: "<<price[i]<<endl;
				cout<<"Publisher: "<<publisher[i]<<endl;
			}	//End of for loop
		}	//End of function
};	//End of class
void main()
{
	clrscr();
	book_list b;
	b.add_newbook();
	b.add_newbook();
	b.add_newbook();
	b.show_list_authorwize();
	getch();
}