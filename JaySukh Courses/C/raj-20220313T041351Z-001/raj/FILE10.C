//to copy one file into another file
//commandline arguments
#include<conio.h>
#include<stdio.h>
void main(int argc,char *argv[])
{
	FILE *p,*q;
	char ch;
	clrscr();
	p=fopen(argv[1],"r");
	if(p==NULL)
		printf("File does not exist");
	q=fopen(argv[2],"w");
	ch=fgetc(p);
	while(ch!=EOF)
	{
		fputc(ch,q);
		printf("%c",ch);
		ch=fgetc(p);

	}
	fclose(p);
	fclose(q);
	getch();
}