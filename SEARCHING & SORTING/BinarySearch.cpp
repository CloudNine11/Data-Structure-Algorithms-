#include<iostream>
using namespace std;
#include<conio.h>

int main()
{
	int arr[100],i,j,n,temp;
	int mid,key,flag;
	cout<<"enter the limit"<<endl;
	cin>>n;
	cout<<"enter the values: "<<endl;
	for(i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	int low=0,high=n-1;
	cout<<"enter the value to be searched : ";
	cin>>key;
	for(i=0;i<n;i++)
	{
		mid=(low+high)/2;	
		if(arr[mid]==key)
		{
			flag=1;
			break;
		}
		else 
		{
			if(key>arr[mid])
			{
				low=mid+1;
			}
			else 
			{
				high=mid-1;
			}
			flag=0;
		}
	}
	if(flag==1)
		cout<<"search value exist at the pos in sorted array : "<<mid+1<<endl;
	else
		cout<<"search value does not exist"<<endl;
}
