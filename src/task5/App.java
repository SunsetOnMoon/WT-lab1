package task5;

import task5.service.NumberFilter;

public class App {
    public static void main(String[] args) {
        NumberFilter numFilter = new NumberFilter();
        int[] inputArray = numFilter.inputArray();
        int unnecessaryNumbersCount = numFilter.unnecessaryNumbersCount(inputArray);
        System.out.println(unnecessaryNumbersCount);
    }
}
