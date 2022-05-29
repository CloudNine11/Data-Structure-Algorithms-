#include<iostream>
using namespace std;


int arr[5];
int rear=0;
int i;
char msg;

void push()
{
    do 
    {
        if(rear==5)
        {
            cout<<" stack overflow ..nothing can be shown"<<endl;
            break;
        }
        else
        {
            cout<<"enter elements in stack"<<endl;
            cin>>arr[rear++];
            cout<<"do you want to continue:"<<endl;
            cin>>msg;
        }
    }while(msg=='Y'||msg=='y');
}
void display()
{
    if(rear==0)
    {
        cout<<"nothing to display"<<endl;

    }
    else
    {
        for(i=0;i<rear;i++)
        {
            cout<<arr[i]<<" "<<endl;
        }
    }
}

void pop()
{
	if(rear==0)
	{
		cout<<"stack underflow ..nothing can be deleted"<<endl;
	}
	else
	{
	    for(i=0;i<rear;i++)
	    {
	    	arr[i]=arr[i+1];
		}
		rear--;
		cout<<"1 item deleted from stack";
	}
}



int main()
{
     int ch;
    a:
     cout<<"main menu"<<endl;
     cout<<"Stack Opeartions:"<<endl;
     cout<<"1.Push"<<endl;
     cout<<"2.Pop"<<endl;
     cout<<"3.Display stack"<<endl;
     cout<<"4.Exit"<<endl;
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
			 	display();
			 	goto a;
		case 4:
				break;	 			
				   		             
    } 

    return 0;
}
