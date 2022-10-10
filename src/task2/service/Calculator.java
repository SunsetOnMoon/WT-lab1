package task2.service;

import java.util.Scanner;
import task2.model.Point;


public class Calculator
{
    private static final int X11 = -4;
    private static final int X12 = 4;
    private static final int Y11 = 0;
    private static final int Y12 = 5;

    private static final int X21 = -6;
    private static final int X22 = 6;
    private static final int Y21 = 0;
    private static final int Y22 = 3;

    public Point point()
    {
        System.out.print("Input x: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("Input y: ");
        int y = scanner.nextInt();
        return new Point(x, y);
    }

    public boolean isThisArea(int x, int y)
    {
        return Math.abs(x) >= X11 && Math.abs(x) <= X12 && Math.abs(y) >= Y11 && Math.abs(y) <= Y12 || Math.abs(x) >= X21 && Math.abs(x) <= X22 && Math.abs(y) >= Y21 && Math.abs(y) <= Y22;
    }
}
