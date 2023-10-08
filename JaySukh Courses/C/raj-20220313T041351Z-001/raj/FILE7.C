//structured i/o
#include<conio.h>
#include<stdio.h>
struct book
{
	int bid;
	char author[25];
	char pub[25];
	int price;
};
void main()
{
	FILE *p;
	struct book b1,b2;
	char ch;
	clrscr();
	p=fopen("temp.c","ab");
	do
	{
		printf("Enter book id,authorname,publishername and price");
		scanf("%d%s%s%d",&b1.bid,b1.author,b1.pub,&b1.price);
		fwrite(&b1,sizeof(b1),1,p);
		printf("do u want to add another book(y/n)");
		fflush(stdin);
		scanf("%c",&ch);
	}
	while(ch=='y' || ch=='Y');
	fclose(p);

	p=fopen("temp.c","rb");

	fread(&b2,sizeof(b2),1,p);
	while(!feof(p))
	{
	    printf("%d\t%s\t%s\t%d\n",b2.bid,b2.author,b2.pub,b2.price);
	    fread(&b2,sizeof(b2),1,p);

	}
	fclose(p);
	getch();

	}