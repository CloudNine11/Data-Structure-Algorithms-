import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch{

public static void main(String[] args) {
    BinarySearch b =new BinarySearch();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no of elements");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("enter array elements");
    for (int i = 0; i < n; i++) {
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    
     System.out.println("enter the value to be searched");
    int key=sc.nextInt();
    int low=0,high=n-1,mid,flag=1;
    for(int i=0;i<n;i++)
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
    System.out.println("search value exists in sorted array");
	else
    System.out.println("search value does not exist");
}   
}

/* 
enter the no of elements
6
enter array elements
22
8
97
87
10
66
[8, 10, 22, 66, 87, 97]
enter the value to be searched
88
search value does not exist
*/