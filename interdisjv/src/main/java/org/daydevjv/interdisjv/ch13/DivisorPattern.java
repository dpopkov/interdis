package org.daydevjv.interdisjv.ch13;

/** Program 1.3.4 Prints an n-by-n table with an asterisk in row i and column j if either i divides j or j divides i. */
public class DivisorPattern {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % j == 0 || j % i == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
