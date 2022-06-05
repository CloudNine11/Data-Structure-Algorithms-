import java.util.*;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int isPrime;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                isPrime = 1;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = 0;
                        break;
                    }
                }
                if (isPrime == 1) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}