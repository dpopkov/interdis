package org.daydevjv.interdisjv.ch12;

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

    public static void main(String[] args) {
        ex1_2_1();
        ex1_2_2();
        ex1_2_3();
        ex1_2_14();
    }
}
