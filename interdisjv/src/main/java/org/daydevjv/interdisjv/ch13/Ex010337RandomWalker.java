package org.daydevjv.interdisjv.ch13;

import java.util.Random;

public class Ex010337RandomWalker {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int size = n * 2;
        int x = n;
        int y = n;
        Random random = new Random();
        int countSteps = 0;
        while (true) {
            int direction = random.nextInt(4);
            switch (direction) {
                case 0: x--; break;
                case 1: y--; break;
                case 2: x++; break;
                case 3: y++; break;
            }
            System.out.printf("(%d, %d)%n", x, y);
            countSteps++;
            if (x < 0 || x >= size || y < 0 || y >= size) {
                System.out.println("Walker hits the boundary.");
                System.out.printf("Walker made %d steps.%n", countSteps);
                break;
            }
        }
    }
}
