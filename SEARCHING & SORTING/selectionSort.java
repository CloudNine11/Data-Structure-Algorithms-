import java.util.*;
public class selectionSort {
    
public static void selectSort(int arr[])
    {
       int n=arr.length;
        int step,min_idx;
        for (step= 0; step< n-1; step++)
        {
            min_idx=step;
            for (int i= step+1; i<n; i++) 
            {
                if(arr[i]<arr[min_idx])
                {
                    min_idx=i;
                }
            }
            //swap(arr[min_idx],arr[step]);  //if we define function  
            int temp = arr[step];
             arr[step] = arr[min_idx];
             arr[min_idx] = temp;
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
        selectSort(arr);
        display(arr);
    }
}
