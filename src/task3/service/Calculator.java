package task3.service;

import task3.model.Values;
import java.util.Scanner;

public class Calculator {

    public Values values()
    {
        System.out.print("Input a: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("Input b: ");
        double b = scanner.nextDouble();
        System.out.print("Input h: ");
        double h = scanner.nextDouble();
        return new Values(a, b, h);
    }

    public void drawTable(Values values)
    {
        drawTableHead();
        double a = values.getA();
        double b = values.getB();
        double h = values.getH();
        while (a <= b)
        {
            System.out.printf("| %3.2f | %9.5f |\n", a, Math.tan(a));
            drawLine();
            a += h;
        }
    }

    public void drawTableHead()
    {
        drawLine();
        System.out.println("|   x   |   F(x)   |");
        drawLine();
    }

    public void drawLine()
    {
        System.out.println("--------------------");
    }
}
