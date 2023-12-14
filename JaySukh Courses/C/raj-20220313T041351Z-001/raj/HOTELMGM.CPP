//Hotel Management System
//Made By Farah and Gaurie
//HEADER FILES
#include<iostream.h>
#include<conio.h>
#include<string.h>
#include<stdio.h>
#include<ctype.h>
#include<stdlib.h>
#include<fstream.h>
#include<dos.h>

fstream f1;



class hotel
{
    int rno;
    char name[30];
    char add[30];
    char telno[10];
    char roomtype[15];
    char date[15];
    double charge;

public:
    hotel()
    {
       charge=0.0;
    }
    void mainmenu();
    void booking();
    void checkout();
    void rooms();
    int check(int);
    void modify();
    void display();
    void showdata()
    {
       cout<<"NAME          :: "<<name<<"\n"
       <<"ADDRESS(R)    :: "<<add<<"\n"
       <<"TEL. NO.(R)   :: "<<telno<<"\n"
       <<"CHECK-IN DATE :: "<<date<<"\n"
       <<"ROOM TYPE     :: "<<roomtype<<"\n"
       <<"CHARGE           ::"<<charge<<"\n";
    }
}h;

void hotel::mainmenu()
{
   int choice;
   while(choice!=6)
   {
      clrscr();
		cout<<"\n\t\t\t\t*************";
		cout<<"\n\t\t\t\t* MAIN MENU *";
		cout<<"\n\t\t\t\t*************";
		cout<<"\n\t\t\t1.Booking/Check-In";
		cout<<"\n\t\t\t2.Check-Out";
		cout<<"\n\t\t\t3.Guest Record";
		cout<<"\n\t\t\t4.Show Data";
		cout<<"\n\t\t\t5.Edit Record";
		cout<<"\n\t\t\t6.Exit";
		cout<<"\n\n\t\t\tEnter Your Choice: ";
		cin>>choice;
				   switch(choice)
		{
			case 1:	booking();
				break;
			case 2:      checkout();
				break;
			case 3:      rooms();
				break;
						    case 4:	display();
				break;
			case 5:	modify();
				break;
			case 6:      cout<<"\n\n\t\t\tExiting From Menu";
								     break;
			default:
				{
				cout<<"\n\n\t\t\tWrong choice.....!!!";
				cout<<"\n\t\t\tPress any key to continue....!!";
				getch();
				}
		}
	}
}

void hotel::booking()
{
clrscr();int flag=0;int r;
ofstream fout("guest.dat",ios::out|ios::app|ios::binary);
cout<<"ENTER THE REQUIRED DATA\n";
cout<<"ENTER YOUR ROOM NO  ::";
cin>>r;
flag=check(r);
if(flag){cout<<"\n Sorry..The Room is already booked!";}
else
{
 rno=r ;
 cout<<"YOUR ROOM NO. IS :: "<<rno<<"\n";
 cout<<"NAME :: ";
 gets(name);
 int l=strlen(name);
 for(int i=0;i<l;i++) name[i]=toupper(name[i]);
 cout<<"ADDRESS(R) :: ";
 gets(add);
 cout<<"TEL. NO.(R) :: ";
 gets(telno);
 cout<<"DATE WHEN YOU WILL CHECK-IN(dd/mm/yyyy) :: ";
 gets(date);
 cout<<"\n\nROOM TYPES  "<<"\t"
 <<"CODES"<<"\t"<<"CHARGE PER DAY\n"
 <<"ROYAL SUITE "<<"\t"<<"1.   "<<"\t"<<"Rs 20,000\n"
 <<"SUPER DELUXE"<<"\t"<<"2.   "<<"\t"<<"Rs 15,000\n"
 <<"DELUXE      "<<"\t"<<"3.   "<<"\t"<<"Rs 10,000\n"
 <<"DOUBLE BED  "<<"\t"<<"4.   "<<"\t"<<"Rs  5,000\n"
 <<"SINGLE BED  "<<"\t"<<"5.   "<<"\t"<<"Rs  2,000\n";
 int roomcode;
 REDO:
 cout<<"ROOM CODE :: ";
 cin>>roomcode;
 switch(roomcode)
 {
	  case 1 : strcpy(roomtype,"ROYAL SUITE");
		   charge=20000;
		   break;
	  case 2 : strcpy(roomtype,"SUPER DELUXE");
		   charge=15000;
		   break;
	  case 3 : strcpy(roomtype,"DELUXE");
		   charge=10000;
		   break;
	  case 4 : strcpy(roomtype,"DOUBLE BED");
		   charge=5000;
		   break;
	  case 5 : strcpy(roomtype,"SINGLE BED");
		   charge=2000;
		   break;
	  default: cout<<"ENTER THE RIGHT CODE\n";
		   goto REDO;
}
fout.write((char *)this,sizeof(hotel));
cout<<"YOUR ROOM IS BOOKED "<<"\n";
}//closing of else
cout<<"PRESS ANY KEY TO CONTINUE";
getch();
fout.close();
}

void hotel::checkout()
{
clrscr();
int r;
cout<<"\n Enter your room no ::";
cin>>r;
int flag=0;
char ch;
ifstream fin("guest.txt",ios::in|ios::binary);
ofstream fout("temp.txt",ios::out|ios::binary);
while(!fin.eof())
{
  fin.read((char *)this,sizeof(hotel));
  if(rno==r)
  {
       cout<<"NAME          :: "<<name<<"\n"
       <<"ADDRESS(R)    :: "<<add<<"\n"
       <<"TEL. NO.(R)   :: "<<telno<<"\n"
       <<"CHECK-IN DATE :: "<<date<<"\n"
       <<"ROOM TYPE     :: "<<roomtype<<"\n"
       <<"CHARGE           ::"<<charge<<"\n";
       cout<<"DO YOU WANT TO CHECK-OUT<Y/N>?";
       cin>>ch;
       if(ch=='n'||ch=='N')
	  fout.write((char *)this,sizeof(hotel));
       flag=1;
   }
   else
     fout.write((char *)this,sizeof(hotel));
}
fin.close();
fout.close();
if(flag==0)
   cout<<"\n SORRY ROOM NOT FOUND OR IS NOT VACANT";
else
{  cout<<"\n\nYOU HAVE BEEN CHECKED OUT. THANKS FOR STAYING";
    remove("guest.dat");
    rename("temp.dat","guest.dat");
}
}

void hotel::modify()
{
clrscr();
int r;
cout<<"\n Enter your room no ::";
cin>>r;
long pos,flag=0;
fstream file("guest.dat",ios::in|ios::out|ios::binary);
while(!file.eof())
{
	pos=file.tellg();
	file.read((char*)this,sizeof(hotel));
	if(rno==r)
	{
		cout<<"\n Enter New Details";
		cout<<"\n -----------------";
		cout<<"\n Name: ";
		gets(name);
		cout<<" Address: ";
		gets(add);
		cout<<" Phone no: ";
		gets(telno);

		file.seekg(pos);
		file.write((char*)this,sizeof(hotel));
		cout<<"\n Record is modified....!!";
		flag=1;
		break;
	}
}

if(flag==0)
cout<<"\n Sorry Room no. not found or vacant...!!";
file.close();
}

int hotel::check(int r)
{
	int flag=0;
	ifstream fin("guest.dat",ios::in|ios::binary);
	while(!fin.eof())
	{
		fin.read((char*)this,sizeof(hotel));
		if(rno==r)
		{
			flag=1;
			break;
		}
	}

	fin.close();
	return(flag);
}

void hotel::rooms()
{
	clrscr();
	ifstream fin("guest.dat",ios::in|ios::binary);
	cout<<"\n\t\t\t    List Of Rooms Allotted";
	cout<<"\n\t\t\t    ----------------------";
	cout<<"\n\n Room No.\tName\t\tAddress\t\t\t\tPhone No.\n";
	fin.read((char*)this,sizeof(hotel));
	while(fin)
	{
		//fin.read((char*)this,sizeof(hotel));
		cout<<"\n\n "<<rno<<"\t\t"<<name;
		cout<<"\t\t"<<add<<"\t\t"<<telno;
		fin.read((char*)this,sizeof(hotel));
	}
	cout<<"\n\n\n\t\t\tPress any key to continue.....!!";
	getch();
	fin.close();
}

void hotel::display()
{
	clrscr();
	ifstream fin("guest.dat",ios::in|ios::binary);
	int r,flag;
	cout<<"\n Enter room no: ";
	cin>>r;
	fin.read((char*)this,sizeof(hotel));
	while(fin)
	{
		//fin.read((char*)this,sizeof(hotel));
		if(rno==r)
		{
			clrscr();
			 cout<<"NAME          :: "<<name<<"\n"
						      <<"ADDRESS(R)    :: "<<add<<"\n"
						      <<"TEL. NO.(R)   :: "<<telno<<"\n"
						      <<"CHECK-IN DATE :: "<<date<<"\n"
						      <<"ROOM TYPE     :: "<<roomtype<<"\n"
						      <<"CHARGE           ::"<<charge<<"\n";

			flag=1;
			break;
		}
		fin.read((char*)this,sizeof(hotel));
	}
		 if(flag==0)
		cout<<"\n Sorry Room no. not found or vacant....!!";

	cout<<"\n\n Press any key to continue....!!";
	getch();
	fin.close();
}
void main()
{

	clrscr();
	cout<<"\n\t\t\t****************************";
	cout<<"\n\t\t\t* HOTEL MANAGEMENT PROJECT *";
	cout<<"\n\t\t\t****************************";
	sleep(2);
	cout<<"\n\n\n\n\t\tMade By:";
	sleep(1);
	cout<<"\tFarah Pankhania and Gaurie Thapar";
	sleep(1);
	cout<<"\n\n\t\tSubmitted To:";
	sleep(1);
	cout<<"\tMrs Yogini Pathak";
	sleep(1);
	clrscr();
	cout<<"\n\t\t\t*************************************";
	cout<<"\n\t\t\t*WELCOME TO HOTEL MAJESTIC EXCALIBUR*";
	cout<<"\n\t\t\t*************************************";
	cout<<"\n\n\n\n\n\n\n\t\t\t\t\tPress any key to continue....!!";
	getch();
	h.mainmenu();
}
