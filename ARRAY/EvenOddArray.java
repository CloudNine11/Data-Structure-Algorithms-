
//Write a progarm that will take an array and store even elements in one array and odd elements in another array 
import java.util.*;

public class EvenOddArray {

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int even = 0, odd = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        int[] b = new int[even];
        int[] c = new int[odd];
        int k = 0, p = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                b[k++] = arr[i];

            } else {
                c[p++] = arr[i];

            }

        }
        k--;// _ _ _ _
        p--;// _ _ _ _

        // System.out.print("even array: ");
        // for (int i = 0; i < even; i++) {
        // System.out.print(b[i]+" ");
        // }
        // System.out.print("odd array: ");
        // for (int i = 0; i < odd; i++) {
        // System.out.print(c[i]+" ");
        // }

        System.out.print("even array: ");
        printArray(b);
        System.out.print("\n odd array: ");
        printArray(c);
    }
}
