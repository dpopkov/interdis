package org.daydevjv.interdisjv.ch13;

/** Program 1.3.1 Flipping a fair coin. */
public class Flip {
    public static void main(String[] args) {
        if (Math.random() < 0.5) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
}
