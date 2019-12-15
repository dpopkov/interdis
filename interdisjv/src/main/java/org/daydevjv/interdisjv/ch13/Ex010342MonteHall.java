package org.daydevjv.interdisjv.ch13;

import java.util.Random;

public class Ex010342MonteHall {
    private static final Random random = new Random();
    public static final int NUM_DOORS = 3;

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int winCount = 0;
        for (int i = 0; i < n; i++) {
            boolean won = simulateGame(true);
            if (won) {
                winCount++;
            }
        }
        System.out.println("Switching door.");
        System.out.println("Wins: " + winCount);
        System.out.println("Lost: " + (n - winCount));

        winCount = 0;
        for (int i = 0; i < n; i++) {
            boolean won = simulateGame(false);
            if (won) {
                winCount++;
            }
        }
        System.out.println("Keeping initial door.");
        System.out.println("Wins: " + winCount);
        System.out.println("Lost: " + (n - winCount));
    }

    private static boolean simulateGame(boolean switchDoor) {
        boolean[] doors = new boolean[NUM_DOORS];
        doors[chooseRandom()] = true;
        int initial = chooseRandom();
        int opened = chooseOpened(doors, initial);
        int unopened = other(initial, opened);
        if (switchDoor) {
            return doors[unopened];
        } else {
            return doors[initial];
        }
    }

    private static int other(int a, int b) {
        switch (a + b) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
            default:
                return 0;
        }
    }

    private static int chooseOpened(boolean[] doors, int initial) {
        if (initial == 0) {
            return chooseOpenedFrom(doors, 1, 2);
        } else if (initial == 1) {
            return chooseOpenedFrom(doors, 0, 2);
        } else {    // initial == 2
            return chooseOpenedFrom(doors, 0, 1);
        }
    }

    private static int chooseOpenedFrom(boolean[] doors, int i, int j) {
        if (doors[i]) {
            return j;
        } else if (doors[j]){
            return i;
        } else {
            return random.nextBoolean() ? i : j;
        }
    }

    private static int chooseRandom() {
        return random.nextInt(NUM_DOORS);
    }
}
