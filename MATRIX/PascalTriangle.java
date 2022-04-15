/* for n=4
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1*/

/* using nCr formula:
n ! / ( n – r ) ! r !
  */
public class PascalTriangle {
    public int factorial(int i) {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }

    public static void main(String[] args) {
        int n = 4, i, j;
        PascalTriangle p = new PascalTriangle();
        for (i = 0; i <= n; i++) {
            for (j = n - 1; j >= i; j--) {

                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {

                // nCr formula
                System.out.print(" " + p.factorial(i) / (p.factorial(i - j) * p.factorial(j)));
            }

            // for newline
            System.out.println();
        }
    }
}
