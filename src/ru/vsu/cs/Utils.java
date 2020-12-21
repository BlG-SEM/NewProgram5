package ru.vsu.cs;

import java.util.Scanner;

public class Utils {

    public static int readHeight(String Name) {
        System.out.print("Enter " + Name + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void printFigure(int h) {
        for (int i = 0; i < h; i++){
            int half = h / 2;
            int helper = 0;

            if (i <= half) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                for (int l = 0; l < i; l++) {
                    System.out.print(l);
                }

                for (int k = i; k < (h - i) * 2 - i - 1; k++) {
                    System.out.print(i);
                }

                int helper1 = 1;
                for (int l = (h - i) * 2 - i - 1; l < (h - i) * 2 - 1; l++) {
                    System.out.print(i - helper1);
                    helper1++;
                }

                System.out.println();
            } else {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                for (int l = 0; l < h - i - helper; l++) {
                    System.out.print(l);
                }

                for (int l = h - i - helper - 1; l > 0; l--) {
                    System.out.print(l - 1);
                }

                System.out.println();
                helper++;
            }
        }
    }
}
