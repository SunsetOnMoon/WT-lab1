package task7;

import java.util.Arrays;
import task7.service.ShellSort;

public class App
{
    public static void main(String[] args)
    {
        ShellSort shellSort = new ShellSort();
        int[] inputArray = shellSort.inputArray();
        System.out.println(Arrays.toString(shellSort.shellSort(inputArray)));
    }
}
