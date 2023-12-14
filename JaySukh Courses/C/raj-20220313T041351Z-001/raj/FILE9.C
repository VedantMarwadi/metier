//structured i/o
#include<conio.h>
#include<stdio.h>
struct book
{
	int  bid;
	char author[25];
	char pub[25];
	int price;
};
void main()
{
	FILE *p;
	struct book b1;
	long int fsize,rsize,norec,no,offset;
	clrscr();
	p=fopen("temp.c","rb");
	fseek(p,0,2);
	fsize=ftell(p);
	printf("The file size id %ld\n",fsize);
	rsize=sizeof(b1);
	printf("Record size %ld\n",rsize);
	norec=fsize/rsize;
	printf("there are %ld of records in the file",norec);
	printf("\nEnter which record you want to display");
	scanf("%ld",&no);
	offset=(no-1)*rsize;
	fseek(p,offset,0);

	fread(&b1,sizeof(b1),1,p);
	while(!feof(p))
	{
	printf("%d\t%s\t%s\t%d\n",b1.bid,b1.author,b1.pub,b1.price);
	  fread(&b1,sizeof(b1),1,p);
	}
	fclose(p);
	getch();

}