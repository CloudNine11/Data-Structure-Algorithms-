
//Write a program that will take an array and find the frequency of a particular array
import java.util.*;

public class frequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int value = sc.nextInt(), c = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == value) {
                c++;
            }
        }
        System.out.println(c);
    }

}