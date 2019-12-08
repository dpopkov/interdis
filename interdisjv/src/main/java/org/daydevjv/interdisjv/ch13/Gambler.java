package org.daydevjv.interdisjv.ch13;

/** Program 1.3.8  Gambler's ruin simulation. */
public class Gambler {
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);  // initial stake
        int goal = Integer.parseInt(args[1]);   // walkaway goal
        int trials = Integer.parseInt(args[2]);
        int bets = 0;
        int wins = 0;
        for (int t = 0; t < trials; t++) {
            int cash = stake;                   // cash on hand
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) {
                    cash++;
                } else {
                    cash--;
                }
            }
            if (cash == goal) {
                wins++;
            }
        }
        System.out.println(100 * wins / trials + "% wins");
        System.out.println("Avg # bets: " + bets / trials);
    }
}
