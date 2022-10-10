package task5.service;

import java.util.Scanner;

public class NumberFilter
{
    public int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Input n: ");
        n = scanner.nextInt();
        int[] numArray = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input array[" + i + "] ");
            numArray[i] = scanner.nextInt();
        }
        return numArray;
    }

    public int unnecessaryNumbersCount(int[] initialArray) {

        if (initialArray.length == 1){
            return 0;
        }

        return countNumbers(initialArray);
    }

    private int countNumbers(int[] numbers){
        int resultCount = 0, currMaxNumber = numbers[0];
        for(int i = 0; i < numbers.length - 1; i++){
            if (numbers[i + 1] <= currMaxNumber){
                resultCount++;
            }
            else{
                currMaxNumber = numbers[i + 1];
            }
        }

        return resultCount;
    }
}
