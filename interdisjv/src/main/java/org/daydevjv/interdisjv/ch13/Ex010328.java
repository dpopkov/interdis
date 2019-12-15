package org.daydevjv.interdisjv.ch13;

import java.util.function.LongConsumer;

/*
1.3.28
Run quick experiments to determine the impact of using the termination condition
(factor <= n / factor) instead of (factor < n) in Factors in Program 1.3.9.
For each method find the largest n such than when you type in an n-digit number,
the program is sure to finish within 10 seconds.
 */
public class Ex010328 {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        int rep = 4;
        if (args.length > 1) {
            rep = Integer.parseInt(args[1]);
        }
        long total1 = 0;
        long total2 = 0;
        for (int i = 0; i < rep; i++) {
            total1 += runMethod(Ex010328::factors, n);
            total2 += runMethod(Ex010328::factorsLonger, n);
        }
        System.out.println("1: average elapsed " + (total1 / rep) + " ms");
        System.out.println("2: average elapsed " + (total2 / rep) + " ms");
    }

    private static long runMethod(LongConsumer method, long n) {
        long start = System.currentTimeMillis();
        method.accept(n);
        return System.currentTimeMillis() - start;

    }

    private static void factors(long n) {
        int factor = 2;
        while (factor <= n / factor) {
            while (n % factor == 0) {
                System.out.print(factor + " ");
                n /= factor;
            }
            factor++;
        }
        if (n > 1) {
            System.out.print(n);
        }
        System.out.println();
    }

    private static void factorsLonger(long n) {
        int factor = 2;
        while (factor <= n) {
            while (n % factor == 0) {
                System.out.print(factor + " ");
                n /= factor;
            }
            factor++;
        }
        if (n > 1) {
            System.out.print(n);
        }
        System.out.println();
    }
}
