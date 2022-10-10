package task2;

import task2.service.Calculator;
import task2.model.Point;

public class App
{
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        Point point = calculator.point();
        boolean result = calculator.isThisArea(point.getX(), point.getY());
        System.out.println(result);
    }
}
