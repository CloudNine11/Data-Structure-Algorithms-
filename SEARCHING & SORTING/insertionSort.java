import java.util.*;
public class insertionSort {
 
public static void insertion(int arr[])
{
    int j,temp;
    int n=arr.length;
    for (int i = 1; i < n; i++) 
    {
        temp=arr[i];   
        j=i-1;
        while(j>=0 && temp <=arr[j])
        {
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=temp;

    }
}
public static void display(int arr[])
{
    int n=arr.length;
    for (int i = 0; i <n ; i++) {
    System.out.print(arr[i]+" ");
     }
}

 public static void main(String[] args)
{   
    int n;
    Scanner sc =new Scanner(System.in);
    n=sc.nextInt();
    bubbleSort bb =new bubbleSort();
    int [] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }     
    insertion(arr);
    display(arr);
}
}
