#include<iostream>
using namespace std;


int arr[5];
int top=0;
int i;
char msg;

void push()
{
    do 
    {
        if(top==5)
        {
            cout<<" stack overflow ..nothing can be shown"<<endl;
            break;
        }
        else
        {
            cout<<"enter elements in stack"<<endl;
            cin>>arr[top++];
            cout<<"do you want to continue:"<<endl;
            cin>>msg;
        }
    }while(msg=='Y'||msg=='y');
}
void display()
{
    if(top==0)
    {
        cout<<"nothing to display"<<endl;

    }
    else
    {
        for(i=top-1;i>=0;i--)
        {
            cout<<arr[i]<<" "<<endl;
        }
    }
}

void pop()
{
	if(top==0)
	{
		cout<<"stack underflow ..nothing can be deleted"<<endl;
	}
	else
	{
		top--;
		cout<<"1 item deleted from stack";
	}
}
void peek()
{
	cout<<arr[top]<<endl;
}


int main()
{
     int ch;
    a:
     cout<<"main menu"<<endl;
     cout<<"Stack Opeartions:"<<endl;
     cout<<"1.Push"<<endl;
     cout<<"2.Pop"<<endl;
     cout<<"3.Peek"<<endl;
     cout<<"4.Display stack"<<endl;
     cout<<"5.Exit"<<endl;
     cout<<"Enter your choice:"<<endl;
     cin>>ch;

   switch(ch)
    {
       		case 1:
               			push();
                		goto a;
       		case 2:
	   			pop();
				goto a;
	   	case 3:
	   			peek();
				goto a;
		case 4:
			 	display();
			 	goto a;
		case 5:
				break;	 			
				   		             
    } 

    return 0;
}
