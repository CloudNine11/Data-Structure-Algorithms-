
//Write a program to count prime numbers from array
import java.util.*;

public class countPrime {
    public static boolean isPrime(int n) {
        int c = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static int countprime(int arr[]) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(countprime(arr));
    }

}
