#include<iostream>
using namespace std;
#include<conio.h>

int main()
{
	int n,i,x,flag=1;
	int arr[100];
	cout<<"enter the no of values"<<endl;
	cin>>n;
	cout<<"enter the values : "<<endl;
	for(i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	cout<<"enter the number to be searched: ";
	cin>>x;
	for(i=0;i<n;i++)
	{
	
		if(arr[i]==x)
		{
			flag=1;
			break;
		}
		else
		{
		 	flag=0;
		}
	}
	if(flag==1)
	{
		cout<<"search value found at position "<<i+1<<endl;
	}
	else
	{
		cout<<"no such value found"<<endl;
	}
	
}
