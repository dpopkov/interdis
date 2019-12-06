package org.daydevjv.interdisjv.ch12;

import java.util.Random;

public class Exercises12 {

    @SuppressWarnings({"UnnecessaryLocalVariable", "UnusedAssignment"})
    private static void ex1_2_1() {
        System.out.println();
        int a = 10;
        int b = 20;
        int t = a;
        b = t;
        a = b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void ex1_2_2() {
        System.out.println();
        System.out.println("r = " + sumOfSquares(0.25));
        System.out.println("r = " + sumOfSquares(0.5));
        System.out.println("r = " + sumOfSquares(0.75));
    }

    private static double sumOfSquares(double a) {
        double cos = Math.cos(a);
        double sin = Math.sin(a);
        return cos * cos + sin * sin;
    }

    @SuppressWarnings("ConstantConditions")
    private static void ex1_2_3() {
        System.out.println();
        System.out.println(longBooleanExpression(true, true));
        System.out.println(longBooleanExpression(false, true));
        System.out.println(longBooleanExpression(true, false));
        System.out.println(longBooleanExpression(false, false));
    }

    @SuppressWarnings("ConstantConditions")
    private static boolean longBooleanExpression(boolean a, boolean b) {
        return (!(a && b) && (a || b)) || ((a && b) || !(a || b));
    }

    // ex1_2_11 in py
    private static void ex1_2_14() {
        System.out.println();
        evenlyDivide(8, 2);
        evenlyDivide(3, 9);
        evenlyDivide(4, 11);
    }

    private static void evenlyDivide(int a, int b) {
        boolean r = a % b == 0 || b % a == 0;
        System.out.println(r);
    }

    // ex1_2_12 in py
    private static void ex1_2_15() {
        System.out.println();
        System.out.println(canMakeTriangle(3, 4, 5));
        System.out.println(canMakeTriangle(2, 4, 7));
    }

    private static boolean canMakeTriangle(int a, int b, int c) {
        boolean oneIsBigger = a >= b + c || b >= a + c || c >= b + a;
        return !oneIsBigger;
    }

    // ex1_2_16 in py
    private static void ex1_2_19() {
        System.out.println();
        System.out.println(randomBetween(0, 10));
        System.out.println(randomBetween(3, 4));
        System.out.println(randomBetween(-1, 1));
    }

    private static int randomBetween(int from, int to) {
        Random random = new Random();
        return from + random.nextInt(to - from + 1);
    }

    // ex1_2_17 in py
    private static void ex1_2_20() {
        System.out.println();
        Random random = new Random();
        int a = random.nextInt(5) + 1;
        int b = random.nextInt(5) + 1;
        System.out.println(a + b);
    }

    // ex1_2_20 in py
    private static void ex1_2_23() {
        System.out.println();
        System.out.println(withinInterval(19, 3));
        System.out.println(withinInterval(20, 3));
        System.out.println(withinInterval(21, 3));
        System.out.println(withinInterval(15, 5));
        System.out.println(withinInterval(20, 6));
        System.out.println(withinInterval(19, 6));
        System.out.println(withinInterval(21, 6));
    }

    private static boolean withinInterval(int day, int month) {
        final int startDay = 20;
        final int startMonth = 3;
        final int endDay = 20;
        final int endMonth = 6;
        boolean out = false;
        if (month < startMonth || month > endMonth) {
            out = true;
        } else if (month == startMonth) {
            out = day < startDay;
        } else if (month == endMonth) {
            out = day > endDay;
        }
        return !out;
    }

    private static void ex1_2_24() {
        System.out.println();
        System.out.println(continuouslyCompoundedInterest(10_000, 3, 0.05));
        System.out.println(continuouslyCompoundedInterest(20_000, 10, 0.15));
    }

    private static double continuouslyCompoundedInterest(double investment, int years, double annualInterestRate) {
        return investment * Math.pow(Math.E, annualInterestRate * years);
    }

    // ex1_2_31 in py
    private static void ex1_2_34() {
        System.out.println();
        threeSort(10, 30, 20);
        threeSort(30, 20, 10);
        threeSort(20, 10, 30);
    }

    private static void threeSort(int a, int b, int c) {
        int tmp;
        if (b < a) {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (c < a) {
            tmp = a;
            a = c;
            c = tmp;
        }
        if (c < b) {
            tmp = b;
            b = c;
            c = tmp;
        }
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        ex1_2_1();
        ex1_2_2();
        ex1_2_3();
        ex1_2_14();
        ex1_2_15();
        ex1_2_19();
        ex1_2_20();
        ex1_2_23();
        ex1_2_24();
        ex1_2_34();
    }
}
