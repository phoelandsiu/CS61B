/** Class that prints the Collatz sequence starting from a given number.
 *  @author Phoeland Siu
 */
public class Collatz {
    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
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

            System.out.print(n + " ");
        }
        /** Return 1 as last number in sequence */
        return 1;
    }
}
