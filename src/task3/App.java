package task3;

import task3.model.Values;
import task3.service.Calculator;

public class App {
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        Values values = calculator.values();
        calculator.drawTable(values);
    }
}
