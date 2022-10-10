package task1;

import task1.model.InputData;
import task1.service.Calculator;

public class App
{
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        InputData inputData = calculator.inputData();
        double result = calculator.calculateFormula(inputData.getX(), inputData.getY());
        System.out.println(result);
    }
}
