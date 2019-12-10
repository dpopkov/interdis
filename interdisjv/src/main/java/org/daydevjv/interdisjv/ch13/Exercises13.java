package org.daydevjv.interdisjv.ch13;

import java.util.Random;

public class Exercises13 {

    private static void ex1_3_1() {
        System.out.println();
        allEqual(10, 10, 10);
        allEqual(10, 10, 11);
        allEqual(10, 11, 10);
        allEqual(11, 10, 10);
    }

    private static void allEqual(int a, int b, int c) {
        System.out.println(a == b && b == c ? "equal" : "not equal");
    }

    private static void ex1_3_5() {
        System.out.println();
        System.out.println(rollLoadedDie());
    }

    private static int rollLoadedDie() {
        Random random = new Random();
        int side = random.nextInt(8) + 1;
        side = Math.min(side, 6);
        return side;
    }

    // ex1_3_8 in py
    private static void ex1_3_10() {
        System.out.println();
        printRandomAndAverage(3);
        printRandomAndAverage(10);
    }

    private static void printRandomAndAverage(int n) {
        Random random = new Random();
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            double d = random.nextDouble();
            sum += d;
            System.out.print(d + " ");
        }
        System.out.println("avg: " + (sum / n));
    }

    // ex1_3_11 in py
    private static void ex1_3_13() {
        int n = 123456789;
        int m = 0;
        while (n != 0) {
            m = m * 10 + n % 10;
            n /= 10;
        }
        System.out.println("n = " + n);
        System.out.println("m = " + m);
    }

    // ex1_3_12 in py
    private static void ex1_3_14() {
        System.out.println();
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.print(f + " ");
            f = f + g;
            g = f - g;
        }
        System.out.println();
    }

    // ex1_3_13 in py
    private static void ex1_3_16() {
        System.out.println();
        printPowersOf2LessThanOrEqual(-1);
        printPowersOf2LessThanOrEqual(1023);
        printPowersOf2LessThanOrEqual(1024);
    }

    private static void printPowersOf2LessThanOrEqual(int n) {
        int power = 1;
        while (power <= n) {
            System.out.print(power + " ");
            power *= 2;
        }
        System.out.println();
    }

    // ex1_3_19 in py
    private static void ex1_3_21() {
        System.out.println();
        printConvertedToBase(11, 2);
        printConvertedToBase(255, 2);
        printConvertedToBase(256, 2);
        printConvertedToBase(255, 16);
        printConvertedToBase(256, 16);
        printConvertedToBase(257, 16);
    }

    private static void printConvertedToBase(long n, int base) {
        final char[] digits = "0123456789ABCDEF".toCharArray();
        int power = 1;
        while (power <= n / base) {
            power *= base;
        }
        while (power > 0) {
            int digit = (int) (n / power);
            System.out.print(digits[digit]);
            if (digit > 0) {
                n %= power;
            }
            power /= base;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ex1_3_1();
        ex1_3_5();
        ex1_3_10();
        ex1_3_13();
        ex1_3_14();
        ex1_3_16();
        ex1_3_21();
    }
}