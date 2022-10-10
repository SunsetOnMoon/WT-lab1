package task1.service;

import task1.model.InputData;
import java.util.Scanner;

public class Calculator {
    public InputData inputData()
    {
        System.out.print("Input x: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.print("Input y: ");
        double y = scanner.nextDouble();
        return new InputData(x, y);
    }

    public double calculateFormula(double x, double y)
    {
        return (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - 2 * x / (1 + x * x * y * y))) + x;
    }
}
