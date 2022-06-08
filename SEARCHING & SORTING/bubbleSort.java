import java.util.*;
public class bubbleSort {

 static public void bubblesort(int arr[]) //writing static public or public static doesn't matter
 {
     int n=arr.length;
     for (int i = 0; i < n-1; i++)
      {
         for (int j = 0; j < n-i-1; j++) 
         {
             if(arr[j]>arr[j+1])
             {
               int temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;

             }
         }
         
     }
 }   

 public static void display(int arr[])
 {
      int n=arr.length;
     for (int i = 0; i <n ; i++) {
         System.out.print(arr[i]+" ");
     }
 }

    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        bubbleSort bb =new bubbleSort();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        bubblesort(arr);
        display(arr);
        
    }
}
