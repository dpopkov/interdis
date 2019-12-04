package org.daydevjv.interdisjv.ch12;

/** Program 1.2.4 Leap year (1.2.5 in py) */
public class LeapYear {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);

        boolean isLeapYear = year % 4 == 0;
        isLeapYear = isLeapYear && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);

        System.out.println(isLeapYear);
    }
}
