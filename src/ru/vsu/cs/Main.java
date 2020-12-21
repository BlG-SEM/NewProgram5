package ru.vsu.cs;

public class Main {

    public static void main(String[] args) {
        int h;
        while (true) {
            h = Utils.readHeight("whole, odd h >= 1");
            if ((h >= 1) && (h % 2 == 1) && (h % 1 == 0)) break;
        }
        Utils.printFigure(h);
    }
}
