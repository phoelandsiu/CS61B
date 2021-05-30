/** Class that prints the Collatz sequence starting from a given number.
 *  @author Phoeland Siu
 */
public class Collatz {

    /** Buggy implementation of nextNumber! */
    public static int nextNumber(int n) {
        if (n  == 128) {
            return 1;
        } else if (n == 5) {
            return 3 * n + 1;
        } else {
            return n * 2;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
<<<<<<< HEAD
        nextNumber(n);
    }
    public static int nextNumber(int n) {
        /**
         * This function prints out the next number in
         * the Collatz sequence.
         */
        while (n != 1) {

            /** If n is odd */
            if ((n%2) == 1)
                n = 3*n + 1;

            /** If n is even */
            else
                n = n/2;

            /** Print out next number in sequence */
            System.out.print(n + " ");
        }
        /** Return 1 as last number in sequence */
        return 1;
=======
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
>>>>>>> 160747451c147c59d8e3cbf70a7afee2b73bebdb
    }
}
