package task8.service;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertSequence
{
    public void getInsertedIndexes(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i = 0;
        for (int j = 0; j < a.size(); j++) {
            if(i < b.size() && b.get(i) <= a.get(j)) {
                System.out.print(j + " ");
                int lastElement = a.get(a.size()-1);
                a.add(lastElement);
                for (int k = a.size()-2; k > j; k--) {
                    a.set(k, a.get(k-1));
                }
                a.set(j, b.get(i));
                i++;
            }
        }
        System.out.println(a);
    }

    public ArrayList<Integer> initArray() {
        ArrayList<Integer> result = new ArrayList<>();
        System.out.print("Input n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            result.add(scanner.nextInt());
        }
        return result;
    }
}
