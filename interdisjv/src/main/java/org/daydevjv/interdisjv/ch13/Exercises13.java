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

    // ex1_3_25 in py
    private static void ex1_3_27() {
        System.out.println();
        printUniqueFactors(17);
        printUniqueFactors(1156);
    }

    private static void printUniqueFactors(int n) {
        int factor = 2;
        while (factor <= n / factor) {
            if (n % factor == 0) {
                System.out.println(factor);
                while (n % factor == 0) {
                    n /= factor;
                }
            }
            factor++;
        }
        if (n > 1) {
            System.out.println(n);
        }
    }

    // ex1_3_27 in py
    private static void ex1_3_29() {
        System.out.println();
        print_checkerboard(3);
        print_checkerboard(8);
    }

    private static void print_checkerboard(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((i + j) % 2 == 0 ? "* " : "  ");
            }
            System.out.println();
        }
    }

    // ex1_3_28 in py
    private static void ex1_3_30() {
        System.out.println();
        System.out.println(greatestCommonDivisor(6, 15));
        System.out.println(greatestCommonDivisor(21, 56));
    }

    static int greatestCommonDivisorRecursive(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b < a) {
            return greatestCommonDivisorRecursive(b, a);
        }
        return greatestCommonDivisorRecursive(b % a, a);
    }

    static int greatestCommonDivisor(int a, int b) {
        int x = a;
        int y = b;
        if (a > b) {
            x = b;
            y = a;
        }
        while (y % x != 0) {
            int tmp = x;
            x = y % x;
            y = tmp;
        }
        return x;
    }

    // ex1_3_29 in py
    private static void ex1_3_31() {
        System.out.println();
        relativelyPrime(5);
        relativelyPrime(20);
    }

    private static void relativelyPrime(int n) {
        System.out.print("  ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d", i);
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d", i);
            for (int j = 1; j <= n; j++) {
                char c = greatestCommonDivisor(i, j) == 1 ? '*' : ' ';
                System.out.printf("%2c", c);
            }
            System.out.println();
        }
    }

    private static void ex1_3_32() {
        System.out.println();
        printAllPositivePowers(31);
        printAllPositivePowers(517);
    }

    private static void printAllPositivePowers(int k) {
        long power = k;
        long powerPrev = 1;
        while (power > powerPrev) {
            System.out.println(power);
            powerPrev = power;
            power *= k;
        }
    }

    // ex1_3_30 in py
    private static void ex1_3_34() {
        System.out.println();
        printSumOfTwoCubesInDifferentWays(1729);
    }

    @SuppressWarnings("SameParameterValue")
    private static void printSumOfTwoCubesInDifferentWays(int n) {
        int m = (int) Math.ceil(Math.pow(n, 1.0 / 3.0));
        for (int i = 1; i < m; i++) {
            int i3 = i * i * i;
            if (i3 < 0) {
                break;
            }
            for (int j = i + 1; j < m; j++) {
                int j3 = j * j * j;
                if (j3 < 0) {
                    break;
                }
                for (int k = 1; k < m; k++) {
                    int k3 = k * k * k;
                    if (k3 < 0) {
                        break;
                    }
                    for (int l = k + 1; l < m; l++) {
                        int l3 = l * l * l;
                        if (l3 < 0) {
                            break;
                        }
                        if (i == k || j == l || (i == l && k == j)) {
                            continue;
                        }
                        int n1 = i3 + j3;
                        int n2 = k3 + l3;
                        if (n1 < 0 || n2 < 0 || n1 > n || n2 > n) {
                            break;
                        }
                        if (n1 == n2) {
                            System.out.printf("%d ^ 3 + %d ^ 3 == %d ^ 3 + %d ^ 3 == %d%n", i, j, k, l, n1);
                        }
                    }
                }
            }
        }
    }

    // ex1_3_33 in py
    private static void ex1_3_35() {
        System.out.println();
        System.out.println(addChecksumDigit("020131452"));
        System.out.println(addChecksumDigit("226611156"));
    }

    private static String addChecksumDigit(String uncheckedIsbn) {
        int checksum = calculateChecksum(uncheckedIsbn);
        int checkDigit = 11 - checksum % 11;
        checkDigit = checkDigit == 11 ? 0 : checkDigit;
        return uncheckedIsbn + (checkDigit == 10 ? 'X' : checkDigit);
    }

    private static int calculateChecksum(String s) {
        int sum = 0;
        int last = s.length() - 1;
        int multiplier = (last == 8) ? 2 : 1;
        for (int i = last; i >= 0; i--) {
            char ch = s.charAt(i);
            int digit = (ch == 'X') ? 10 : (ch - '0');
            sum += multiplier * digit;
            multiplier++;
        }
        return sum;
    }

    // ex1_3_34 in py
    private static void ex1_3_36() {
        System.out.println();
        System.out.println(countPrimes(5));
        System.out.println(countPrimes(30));
    }

    static int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    static int countPrimesInSieve(int n) {
        boolean[] sieve = new boolean[n + 1];
        int i2;
        for (int i = 2; (i2 = i * i) < sieve.length; i++) {
            if (!sieve[i]) {
                for (int j = i2; j < sieve.length; j += i) {
                    sieve[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < sieve.length; i++) {
            if (!sieve[i]) {
                count++;
            }
        }
        return count;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ex1_3_1();
        ex1_3_5();
        ex1_3_10();
        ex1_3_13();
        ex1_3_14();
        ex1_3_16();
        ex1_3_21();
        ex1_3_27();
        ex1_3_29();
        ex1_3_30();
        ex1_3_31();
        ex1_3_32();
        ex1_3_34();
        ex1_3_35();
        ex1_3_36();
    }
}
