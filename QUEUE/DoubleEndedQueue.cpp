//Deque

#include<iostream>
using namespace std;


int arr[5];
int rear=0;
int i;
char msg;

void addFromRear()//fi
{
    do 
    {
        if(rear==5)
        {
            cout<<" queue overflow ..nothing can be shown"<<endl;
            break;//mandatory otherwise fall under infinite loop
        }
        else
        {
            cout<<"enter elements in queue"<<endl;
            cin>>arr[rear++];
            cout<<"do you want to continue:"<<endl;
            cin>>msg;
        }
    }while(msg=='Y'||msg=='y');
}

void addFromFront()
{
	if(rear==5)
        {
            cout<<" queue overflow ..nothing can be shown"<<endl;
            //break;//mandatory otherwise fall under infinite loop
        }
    else
	{
		for(i=rear-1;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		cout<<"enter elements you want to add:"<<endl;
		cin>>arr[0];
		rear++;
    }
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

void deleteFromFront()//fo
{
	if(rear==0)
	{
		cout<<"queue underflow ..nothing can be deleted"<<endl;
	}
	else
	{
	    for(i=0;i<rear;i++)
	    {
	    	arr[i]=arr[i+1];
		}
		rear--;
		cout<<"1 item deleted from front ";
	}
}

void deleteFromRear()
{
	if(rear==0)
	{
		cout<<"queue underflow ..nothing can be deleted"<<endl;
	}
	else
	{
		rear--;
		cout<<"1 item deleted from rear";
		
	}
}



int main()
{
     int ch;
    a:
     cout<<"main menu"<<endl;
     cout<<"Queue Opeartions:"<<endl;
     cout<<"1.add From Rear"<<endl;
     cout<<"2.add From Front"<<endl;
     cout<<"3.delete From Front"<<endl;
     cout<<"4.delete From Rear"<<endl;
     cout<<"5.Display"<<endl;
     cout<<"6.Exit"<<endl;
     cout<<"Enter your choice:"<<endl;
     cin>>ch;

   switch(ch)
    {
        case 1:
               	addFromRear();
                goto a;
        case 2:
	   			addFromFront();
				goto a;
	 
		case 3:
			 	deleteFromFront();
			 	goto a;
		case 4:
				deleteFromRear();
			 	goto a;		 	
		case 5:
				display();
				goto a;
		case 6:
				break;		 			
				   		             
    } 

    return 0;
}
