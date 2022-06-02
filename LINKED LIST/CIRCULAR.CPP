#include<iostream>
#include<conio.h>
using namespace std;
class student
{
	public:
	int roll;
	char nm[10];
	student *next;
	void acc()
	{
		cout<<"enter roll : ";
		cin>>roll;
		cout<<"enter name : ";
		cin>>nm;

	}
	void dis()
	{
		cout<<"roll : "<<roll<<"	name : "<<nm<<endl;
	}
};
class start
{
	public:
	start *next;
}*beg=NULL;
void add_rec()
{
	student *s1,*s2;
	char ch;
	do
	{
		if(beg->next==NULL)
		{
			s1=new student;
			s1->acc();
			beg->next=(start *)s1;
			s1->next=(student *)beg ;
		}
		else
		{
			s1=(student *)beg->next;
			while(s1->next!=NULL)
			{
				s1=s1->next;
			}
			s2=new student;
			s2->acc();
			s1->next=s2;
			s2->next=(student *)beg;
		}
		cout<<"wants to continue? : ";
		cin>>ch;
	}while(ch=='y' || ch=='Y');
}
void dis_rec()
{
	student *s1=(student *)beg->next;
	while(s1->next!=(student *)beg)
	{
		s1->dis();
		s1=s1->next;
	}
	s1->dis();
}
void mod_rec()
{
	student *s1=(student *)beg->next;
	int r;
	cout<<"enter roll to modify : ";
	cin>>r;
	while(s1->next!=(student *)beg)
	{
		if(s1->roll==r)
		{
			break;
		}
		else
		{
			s1=s1->next;
		}
	}
	if(s1->next==(student *)beg && s1->roll!=r)
	{
		cout<<"no such record found"<<endl;
	}
	else
	{
		cout<<"enter the new name : ";
		cin>>s1->nm;
		cout<<"record updated"<<endl;
	}
}
void del_rec()
{
	student *s1=(student *)beg->next;
	student *s2=s1->next;
	int r;
	cout<<"enter roll to delete : ";
	cin>>r;
	if(s1->roll==r)
	{
		beg->next=(start *)s1->next;
		delete s1;
		cout<<"record deleted"<<endl;
	}
	else
	{
		while(s2->next!=(student *)beg)
		{
			if(s2->roll==r)
			{
				break;
			}
			else
			{
				s1=s1->next;
				s2=s2->next;
			}
		}
		if(s2->next==(student *)beg && s2->roll!=r)
		{
			cout<<"no such record found"<<endl;
		}
		else
		{
			s1->next=s2->next;
			delete s2;
			cout<<"record deleted"<<endl;
		}
	}
}
int main()
{
	int ch;
	a:
	cout<<"main menu"<<endl;
	cout<<"1. store record"<<endl;
	cout<<"2. display record"<<endl;
	cout<<"3. modify record"<<endl;
	cout<<"4. delete record"<<endl;
	cout<<"5. exit"<<endl;
	cout<<"enter choice : ";
	cin>>ch;
	switch(ch)
	{
		case 1:
			add_rec();
			getch();
			goto a;
		case 2:
			dis_rec();
			getch();
			goto a;
		case 3:
			mod_rec();
			getch();
			goto a;
		case 4:
			del_rec();
			getch();
			goto a;
		case 5:
			break;
		default:
			cout<<"invalid entry again"<<endl;
			getch();
			goto a;
	}
}
