package task4.service;

import java.util.Scanner;

public class Calculator
{
    private boolean isPrime(int num)
    {
        if (num <= 1)
            return false;
        boolean flag = true;
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                flag = false;
                break;
            }
        }
        return flag;
    }

    private int[] inputArray()
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter n: ");
        n = scanner.nextInt();
        int[] numArray = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Input array[" + i + "]: ");
            numArray[i] = scanner.nextInt();
        }
        return numArray;
    }

    public void getPosOfPrimeNums()
    {
        int[] numArray = inputArray();
        for (int i = 0; i < numArray.length; i++)
        {
            if (isPrime(numArray[i]))
                System.out.println(i);
        }
    }
}
